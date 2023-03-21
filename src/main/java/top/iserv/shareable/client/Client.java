package top.iserv.shareable.client;

import com.alibaba.fastjson2.JSON;
import top.iserv.shareable.AbstractClient;
import top.iserv.shareable.Config;
import top.iserv.shareable.request.AmountRequest;
import top.iserv.shareable.response.AmountResponse;

public class Client extends AbstractClient {
    public Client(Config config) {
        super(config);
    }

    public AmountResponse amountInquiry(AmountRequest request) throws IllegalAccessException {
        String respData = send(request.getApiUri(), request.getParams());

        AmountResponse response = JSON.parseObject(respData, AmountResponse.class);

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    private void checkBizCode(int code, String errMsg) {
        if (code != 200) {
            throw new RuntimeException("业务请求响应抛出一场。Err: " + code + "::" + errMsg);
        }
    }
}
