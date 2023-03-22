package top.iserv.shareable.request;

import top.iserv.shareable.AbstractRequest;

public class RefundRequest extends AbstractRequest {
    /**
     * 收单商户号
     */
    private String mchId;

    /**
     * 分账单号，分账方的分账订单号
     */
    private String mchSharingNo;

    /**
     * 商户回退单号
     */
    private String mchReturnNo;

    /**
     * 回退方标识，需与对应分账订单查询结果一致
     */
    private String returnReceiverId;

    /**
     * 回退方类型，需与对应分账订单查询结果一致
     */
    private String returnReceiverType;

    /**
     * 回退描述
     */
    private String returnDescription;

    /**
     * 回退金额，单位为分
     */
    private int returnAmount;

    @Override
    public String getApiUri() {
        return "/api/sharing/refund";
    }

    public String getMchId() {
        return mchId;
    }

    public RefundRequest setMchId(String mchId) {
        this.mchId = mchId == null ? "" : mchId.trim();

        return this;
    }

    public String getMchSharingNo() {
        return mchSharingNo;
    }

    public RefundRequest setMchSharingNo(String mchSharingNo) {
        this.mchSharingNo = mchSharingNo == null ? "" : mchSharingNo.trim();

        return this;
    }

    public String getMchReturnNo() {
        return mchReturnNo;
    }

    public RefundRequest setMchReturnNo(String mchReturnNo) {
        this.mchReturnNo = mchReturnNo == null ? "" : mchReturnNo.trim();

        return this;
    }

    public String getReturnReceiverId() {
        return returnReceiverId;
    }

    public RefundRequest setReturnReceiverId(String returnReceiverId) {
        this.returnReceiverId = returnReceiverId == null ? "" : returnReceiverId.trim();

        return this;
    }

    public String getReturnReceiverType() {
        return returnReceiverType;
    }

    public RefundRequest setReturnReceiverType(String returnReceiverType) {
        this.returnReceiverType = returnReceiverType == null ? "" : returnReceiverType.trim();

        return this;
    }

    public String getReturnDescription() {
        return returnDescription;
    }

    public RefundRequest setReturnDescription(String returnDescription) {
        this.returnDescription = returnDescription == null ? "" : returnDescription.trim();

        return this;
    }

    public int getReturnAmount() {
        return returnAmount;
    }

    public RefundRequest setReturnAmount(int returnAmount) {
        this.returnAmount = returnAmount;

        return this;
    }

    @Override
    public String toString() {
        return "RefundRequest{" +
                "mchId='" + mchId + '\'' +
                ", mchSharingNo='" + mchSharingNo + '\'' +
                ", mchReturnNo='" + mchReturnNo + '\'' +
                ", returnReceiverId='" + returnReceiverId + '\'' +
                ", returnReceiverType='" + returnReceiverType + '\'' +
                ", returnDescription='" + returnDescription + '\'' +
                ", returnAmount=" + returnAmount +
                '}';
    }
}
