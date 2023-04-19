# 介绍
分账 SDK java

# 调用

```java
import top.iserv.shareable.Config;
import top.iserv.shareable.client.Client;
import top.iserv.shareable.request.AmountRequest;
import top.iserv.shareable.response.AmountResponse;

public class Main {
    public static void main(String[] args) {
        try {
            Config config = new Config();
            config.setAppId("******")
                    .setPrivateKey("*********") /*pkcs8*/
                    .setPlatformPublicKey("*********");

            AmountRequest request = new AmountRequest();
            request.setMchId("*****").setTransactionId("********");

            Client client = new Client(config);

            AmountResponse response = client.amountInquiry(request);

            System.out.println(response);
            System.out.println(response.getData());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

```

# 接口

| API       | 请求类                   | 响应类                    |
|-----------|-----------------------|------------------------|
| 添加分账接收方   | BindRequest           | BindResponse           |
| 删除分账接收方   | UnbindRequest         | UnbindResponse         |
| 查询订单待分账金额 | AmountRequest         | AmountResponse         |
| 分账        | SharingRequest        | SharingResponse        |
| 分账查询      | SharingInquiryRequest | SharingInquiryResponse |
| 分账回退      | RefundRequest         | RefundResponse         |
| 分账回退查询    | RefundInquiryRequest  | RefundInquiryResponse  |
