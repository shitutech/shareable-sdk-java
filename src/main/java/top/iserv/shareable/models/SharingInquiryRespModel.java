package top.iserv.shareable.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

public class SharingInquiryRespModel implements Serializable {

    private static final long serialVersionUID = 570461116566926353L;

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

    /**
     * PROCESSING-处理中 FINISHED-处理完成
     */
    private String status;

    /**
     * 分账接收方, 分账接收方信息
     */
    private String receivers;

    @JSONField(serialize = false, deserialize = false)
    private List<SharingInquiryReceiverModel> receiverModel;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceivers() {
        return receivers;
    }

    public void setReceivers(String receivers) {
        this.receivers = receivers;
    }

    public List<SharingInquiryReceiverModel> getReceiverModel() {
        return receiverModel;
    }

    public void setReceiverModel(List<SharingInquiryReceiverModel> receiverModel) {
        this.receiverModel = receiverModel;
    }

    @Override
    public String toString() {
        return "SharingInquiryRespModel{" +
                "mchId='" + mchId + '\'' +
                ", mchSharingNo='" + mchSharingNo + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", sharingNo='" + sharingNo + '\'' +
                ", status='" + status + '\'' +
                ", receivers='" + receivers + '\'' +
                '}';
    }
}
