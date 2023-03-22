package top.iserv.shareable.models;

import java.io.Serializable;

public class SharingInquiryReceiverModel implements Serializable {

    private static final long serialVersionUID = -2436470522276538979L;

    /**
     * 分账接收方标识， receiverType B时表示商户号，C时表示钱包会员unionId
     */
    private String receiverId;

    /**
     * 分账接收方类型，B商户。C钱包会员
     */
    private String receiverType;

    /**
     * 分账金额，单位分
     */
    private int amount;

    /**
     * 分账描述
     */
    private String description;

    /**
     * 分账状态，分账状态ING-处理中，SUCCESS-成功，FAIL-失败
     */
    private String sharingStatus;

    /**
     * 分账完成时间
     */
    private String finishTime;

    /**
     * 分账失败原因
     */
    private String failReason;

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(String receiverType) {
        this.receiverType = receiverType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSharingStatus() {
        return sharingStatus;
    }

    public void setSharingStatus(String sharingStatus) {
        this.sharingStatus = sharingStatus;
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
        return "SharingInquiryReceiverModel{" +
                "receiverId='" + receiverId + '\'' +
                ", receiverType='" + receiverType + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", sharingStatus='" + sharingStatus + '\'' +
                ", finishTime='" + finishTime + '\'' +
                ", failReason='" + failReason + '\'' +
                '}';
    }
}
