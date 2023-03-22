package top.iserv.shareable.models;

import java.io.Serializable;

public class ReceiverModel implements Serializable {

    private static final long serialVersionUID = -214817006855138531L;

    /**
     * 分账接收方标识，分账接收方入驻后的商户号
     */
    private String receiverId;

    /**
     * 分账接收方类型，当前固定为 B (商户号)
     * 分账接收方类型，B商户 C钱包会员
     */
    private String receiverType = "B";

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId == null ? "" : receiverId.trim();
    }

    public String getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(String receiverType) {
        this.receiverType = receiverType == null ? "" : receiverType.trim();
    }

    @Override
    public String toString() {
        return "ReceiverModel{" +
                "receiverId='" + receiverId + '\'' +
                ", receiverType='" + receiverType + '\'' +
                '}';
    }
}
