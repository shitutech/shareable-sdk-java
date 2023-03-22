package top.iserv.shareable.client;

import com.alibaba.fastjson.JSON;
import top.iserv.shareable.AbstractClient;
import top.iserv.shareable.Config;
import top.iserv.shareable.request.AmountRequest;
import top.iserv.shareable.request.BindRequest;
import top.iserv.shareable.response.AmountResponse;
import top.iserv.shareable.response.BindResponse;

public class Client extends AbstractClient {
    public Client(Config config) {
        super(config);
    }

    public BindResponse bind(BindRequest request) {
        String respData = send(request);

        BindResponse response = JSON.parseObject(respData, BindResponse.class);

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    public AmountResponse amountInquiry(AmountRequest request) {
        String respData = send(request);

        AmountResponse response = JSON.parseObject(respData, AmountResponse.class);

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    private void checkBizCode(int code, String errMsg) {
        if (code != 200) {
            throw new RuntimeException("业务请求响应抛出异常。Err: " + code + "::" + errMsg);
        }
    }
}
