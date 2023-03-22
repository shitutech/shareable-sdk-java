package top.iserv.shareable.models;

import java.io.Serializable;

public class SharingRespModel implements Serializable {

    private static final long serialVersionUID = 875425080043683029L;

    /**
     * 收单商户号
     */
    private String mchId;

    /**
     * 分账单号，分账方的分账订单号
     */
    private String mchSharingNo;

    /**
     * 上游交易订单号
     */
    private String transactionId;

    /**
     * 分账单号
     */
    private String sharingNo;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getMchSharingNo() {
        return mchSharingNo;
    }

    public void setMchSharingNo(String mchSharingNo) {
        this.mchSharingNo = mchSharingNo;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSharingNo() {
        return sharingNo;
    }

    public void setSharingNo(String sharingNo) {
        this.sharingNo = sharingNo;
    }

    @Override
    public String toString() {
        return "SharingRespModel{" +
                "mchId='" + mchId + '\'' +
                ", mchSharingNo='" + mchSharingNo + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", sharingNo='" + sharingNo + '\'' +
                '}';
    }
}
