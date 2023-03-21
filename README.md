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
