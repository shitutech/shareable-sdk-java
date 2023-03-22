package top.iserv.shareable.request;

import com.alibaba.fastjson.annotation.JSONField;
import top.iserv.shareable.AbstractRequest;
import top.iserv.shareable.models.SharingReceiverReqModel;
import top.iserv.shareable.serializers.RequestModelJsonValueSerializer;

import java.util.ArrayList;

public class SharingRequest extends AbstractRequest {
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
     * 分账接收方列表分账金额之和，单位分， 例如：100
     */
    private int totalAmount;

    /**
     * 分账接收方，分账接收方信息，json格式的字符串，最多5个
     */
    @JSONField(serializeUsing = RequestModelJsonValueSerializer.class)
    private ArrayList<SharingReceiverReqModel> receivers;

    @Override
    public String getApiUri() {
        return "/api/sharing";
    }

    public String getMchId() {
        return mchId;
    }

    public SharingRequest setMchId(String mchId) {
        this.mchId = mchId == null ? "" : mchId.trim();

        return this;
    }

    public String getMchSharingNo() {
        return mchSharingNo;
    }

    public SharingRequest setMchSharingNo(String mchSharingNo) {
        this.mchSharingNo = mchSharingNo == null ? "" : mchSharingNo.trim();

        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public SharingRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? "" : transactionId.trim();

        return this;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public SharingRequest setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;

        return this;
    }

    public ArrayList<SharingReceiverReqModel> getReceivers() {
        return receivers;
    }

    public SharingRequest setReceivers(ArrayList<SharingReceiverReqModel> receivers) {
        if (receivers.size() > 5) {
            throw new RuntimeException("最多仅允许 5 个分账接收方");
        }

        this.receivers = receivers;

        return this;
    }

    public SharingRequest appendReceiver(SharingReceiverReqModel receiver) {
        if (receivers == null) {
            receivers = new ArrayList<>();
        }

        if (receivers.size() > 5) {
            throw new RuntimeException("最多仅允许 5 个分账接收方");
        }

        receivers.add(receiver);

        return this;
    }

    @Override
    public String toString() {
        return "SharingRequest{" +
                "mchId='" + mchId + '\'' +
                ", mchSharingNo='" + mchSharingNo + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", totalAmount=" + totalAmount +
                ", receivers=" + receivers +
                '}';
    }
}
