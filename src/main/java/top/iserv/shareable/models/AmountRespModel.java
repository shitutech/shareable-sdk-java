package top.iserv.shareable.models;

import java.io.Serializable;

public class AmountRespModel implements Serializable {

    private static final long serialVersionUID = 2526037707682488265L;

    /**
     * 收单商户号
     */
    private String mchId;

    /**
     * 上游交易订单号
     */
    private String transactionId;

    /**
     * 订单剩余待分金额，单位分
     */
    private long sharableAmount;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public long getSharableAmount() {
        return sharableAmount;
    }

    public void setSharableAmount(long sharableAmount) {
        this.sharableAmount = sharableAmount;
    }

    @Override
    public String toString() {
        return "AmountRespModel{" +
                "mchId='" + mchId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", sharableAmount=" + sharableAmount +
                '}';
    }
}
