package top.iserv.shareable.client;

import top.iserv.shareable.AbstractClient;
import top.iserv.shareable.Config;
import top.iserv.shareable.request.AmountRequest;

public class Client extends AbstractClient {
    public Client(Config config) {
        super(config);
    }

    public String amountInquiry(AmountRequest request) throws IllegalAccessException {
        String respData = send(request.getApiUri(), request.getParams());
        return respData;
    }
}
