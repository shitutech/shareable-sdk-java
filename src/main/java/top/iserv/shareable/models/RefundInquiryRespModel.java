package top.iserv.shareable.models;

import java.io.Serializable;

public class RefundInquiryRespModel implements Serializable {

    private static final long serialVersionUID = 5695889238571329545L;

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
     * 上游回退单号
     */
    private String returnNo;

    /**
     * 回退状态SUCCESS-成功， FAIL-失败， ING-处理中
     */
    private String returnStatus;

    /**
     * 回退方标识
     */
    private String returnReceiverId;

    /**
     * 回退方类型
     */
    private String returnReceiverType;

    /**
     * 回退金额，单位为分
     */
    private int returnAmount;

    /**
     * 回退完成时间
     */
    private String finishTime;

    /**
     * 回退失败原因，仅在失败时有值
     */
    private String failReason;

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

    public String getMchReturnNo() {
        return mchReturnNo;
    }

    public void setMchReturnNo(String mchReturnNo) {
        this.mchReturnNo = mchReturnNo;
    }

    public String getReturnNo() {
        return returnNo;
    }

    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getReturnReceiverId() {
        return returnReceiverId;
    }

    public void setReturnReceiverId(String returnReceiverId) {
        this.returnReceiverId = returnReceiverId;
    }

    public String getReturnReceiverType() {
        return returnReceiverType;
    }

    public void setReturnReceiverType(String returnReceiverType) {
        this.returnReceiverType = returnReceiverType;
    }

    public int getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(int returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public String toString() {
        return "RefundInquiryRespModel{" +
                "mchId='" + mchId + '\'' +
                ", mchSharingNo='" + mchSharingNo + '\'' +
                ", mchReturnNo='" + mchReturnNo + '\'' +
                ", returnNo='" + returnNo + '\'' +
                ", returnStatus='" + returnStatus + '\'' +
                ", returnReceiverId='" + returnReceiverId + '\'' +
                ", returnReceiverType='" + returnReceiverType + '\'' +
                ", returnAmount=" + returnAmount +
                ", finishTime='" + finishTime + '\'' +
                ", failReason='" + failReason + '\'' +
                '}';
    }
}
