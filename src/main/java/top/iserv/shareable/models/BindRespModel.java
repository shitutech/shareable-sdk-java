package top.iserv.shareable.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class BindRespModel implements Serializable {

    private static final long serialVersionUID = -3231010843469556488L;

    /**
     * 收单商户号
     */
    private String mchId;

    /**
     * 分账接收方信息
     */
    private String receiver;

    @JSONField(serialize = false, deserialize = false)
    private ReceiverModel receiverModel;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public ReceiverModel getReceiverModel() {
        return receiverModel;
    }

    public void setReceiverModel(ReceiverModel receiverModel) {
        this.receiverModel = receiverModel;
    }

    @Override
    public String toString() {
        return "BindRespModel{" +
                "mchId='" + mchId + '\'' +
                ", receiver=" + receiver +
                '}';
    }
}
