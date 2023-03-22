package top.iserv.shareable.models;

import java.io.Serializable;

public class SharingReceiverReqModel implements Serializable {

    private static final long serialVersionUID = 2273729092464778797L;

    /**
     * 分账接收方标识，接收方入驻后的商户号
     */
    private String receiverId;

    /**
     * 分账接收方类型，当前固定值 B （商户号）
     */
    private String receiverType = "B";

    /**
     * 分账金额，单位分
     */
    private int amount;

    /**
     * 分账描述
     */
    private String description;

    public String getReceiverId() {
        return receiverId;
    }

    public SharingReceiverReqModel setReceiverId(String receiverId) {
        this.receiverId = receiverId == null ? "" : receiverId.trim();

        return this;
    }

    public String getReceiverType() {
        return receiverType;
    }

    public SharingReceiverReqModel setReceiverType(String receiverType) {
        this.receiverType = receiverType == null ? "" : receiverType.trim();

        return this;
    }

    public int getAmount() {
        return amount;
    }

    public SharingReceiverReqModel setAmount(int amount) {
        this.amount = amount;

        return this;
    }

    public String getDescription() {
        return description;
    }

    public SharingReceiverReqModel setDescription(String description) {
        this.description = description == null ? "" : description.trim();

        return this;
    }

    @Override
    public String toString() {
        return "SharingReceiverReqModel{" +
                "receiverId='" + receiverId + '\'' +
                ", receiverType='" + receiverType + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
