package top.iserv.shareable.request;

import top.iserv.shareable.AbstractRequest;

public class AmountRequest extends AbstractRequest<AmountRequest> {
    /**
     * 收单商户号
     */
    private String mchId = "";

    /**
     * 上游交易订单号
     */
    private String transactionId = "";

    @Override
    public String getApiUri() {
        return "/api/sharing/sharable-amount/inquiry";
    }

    public String getMchId() {
        return mchId;
    }

    public AmountRequest setMchId(String mchId) {
        this.mchId = mchId == null ? "" : mchId.trim();

        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public AmountRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? "" : transactionId.trim();

        return this;
    }

    @Override
    public String toString() {
        return "AmountRequest{" +
                "mchId='" + mchId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
