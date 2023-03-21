package top.iserv.shareable;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;

public abstract class AbstractClient {
    private final Config config;

    /**
     * 签名字符串
     */
    private String signStr;

    /**
     * 签名
     */
    private String sign;

    protected AbstractClient(Config config) {
        this.config = config;
    }

    public String getSignStr() {
        return signStr;
    }

    public String getSign() {
        return sign;
    }

    /**
     * @see <a href="https://docs.iserv.top/sharing/technology.html">分账技术对接说明</a>
     */
    protected String send(String apiUri, HashMap<String, Object> reqMap) {
        try {
            String method = "POST";
            URL url = new URL("https://pay.51wanquan.com" + apiUri);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setConnectTimeout(3000);

            // 设置 header
            connection.setRequestProperty("Charset", "utf-8");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "YlShareableSDK/v1.0.0");

            // 签名串构成
            String nonceStr = UtilHelper.randomString(32);
            long timestamp = System.currentTimeMillis();
            String reqBody = JSON.toJSONString(reqMap);

            String signStr = method + "\n" + apiUri + "\n" + timestamp + "\n" + nonceStr + "\n" +
                    reqBody + "\n";
            String sign = calculateSign(signStr);

            this.signStr = signStr;
            this.sign = sign;

            // 设置 Authorization 头
            String authStr = config.getAppId() + ":" + nonceStr + ":" + config.getSignType() + ":" +
                    timestamp + ":" + sign;
            connection.setRequestProperty("Authorization", authStr);

            connection.connect();

            // 发送请求
            final BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(connection.getOutputStream(), StandardCharsets.UTF_8)
            );
            bufferedWriter.write(reqBody);
            bufferedWriter.flush();
            bufferedWriter.close();

            int statusCode = connection.getResponseCode();

            // 读取响应
            StringBuffer respData = new StringBuffer();

            InputStream inputStream;
            if (HttpURLConnection.HTTP_OK == statusCode) {
                inputStream = connection.getInputStream();
            } else {
                inputStream = connection.getErrorStream();
            }

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8)
            )) {
                String line;

                while ((line = reader.readLine()) != null) {
                    respData.append(line);
                }
            } finally {
                connection.disconnect();
            }

            String resp = respData.toString().trim();

            if (HttpURLConnection.HTTP_OK == statusCode) {
                String respSign = connection.getHeaderField("Response-Signature");
                respSign = respSign == null ? "" : respSign.trim();

                if (respSign.length() < 1) {
                    throw new RuntimeException("响应中验签信息无效");
                }

                verifySign(resp, respSign);

                if (resp.length() < 1) {
                    throw new RuntimeException("接口请求响应数据为空");
                }
            }

            return resp;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String calculateSign(String signStr)
            throws NoSuchAlgorithmException, InvalidKeySpecException,
            InvalidKeyException, SignatureException {

        byte[] bytes = Base64.getDecoder().decode(config.getPrivateKey());
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(bytes);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);

        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(signStr.getBytes(StandardCharsets.UTF_8));

        byte[] signBytes = signature.sign();

        return Base64.getEncoder().encodeToString(signBytes);
    }

    private void verifySign(String bizData, String signStr)
            throws NoSuchAlgorithmException, InvalidKeySpecException,
            InvalidKeyException, SignatureException {

        byte[] bytes = Base64.getDecoder().decode(config.getPlatformPublicKey());
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bytes);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);

        String[] stringList = signStr.split(":", 3);
        if (stringList.length < 3) {
            throw new RuntimeException("响应验签不符合格式");
        }

        String finalSignStr = stringList[0] + "\n" + stringList[1] + "\n" + bizData + "\n";

        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(publicKey);
        signature.update(finalSignStr.getBytes(StandardCharsets.UTF_8));

        byte[] signBytes = Base64.getDecoder().decode(stringList[2]);

        if (!signature.verify(signBytes)) {
            throw new RuntimeException("响应验签失败");
        }
    }
}
