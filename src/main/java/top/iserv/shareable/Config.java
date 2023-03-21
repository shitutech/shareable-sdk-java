package top.iserv.shareable;

public class Config {
    /**
     * 接入方分配的appId
     */
    private String appId = "";

    /**
     * 签名方式，固定值为RSA2, 签名算法为Sha256WithRSA
     */
    private String signType = "RSA2";

    /**
     * 商户签名私钥，用于数据加密
     */
    private String privateKey = "";

    /**
     * 平台公钥，用于响应验签
     */
    private String platformPublicKey = "";

    public String getAppId() {
        return appId;
    }

    public Config setAppId(String appId) {
        this.appId = appId == null ? "" : appId.trim();

        return this;
    }

    public String getSignType() {
        return signType;
    }

    public Config setSignType(String signType) {
        this.signType = signType == null ? "" : signType.trim();

        return this;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public Config setPrivateKey(String privateKey) {
        this.privateKey = privateKey == null ? "" : privateKey.trim();

        return this;
    }

    public String getPlatformPublicKey() {
        return platformPublicKey;
    }

    public Config setPlatformPublicKey(String platformPublicKey) {
        this.platformPublicKey = platformPublicKey == null ? "" : platformPublicKey.trim();

        return this;
    }

    @Override
    public String toString() {
        return "Config{" +
                "appId='" + appId + '\'' +
                ", signType='" + signType + '\'' +
                ", privateKey='" + privateKey + '\'' +
                ", platformPublicKey='" + platformPublicKey + '\'' +
                '}';
    }
}
