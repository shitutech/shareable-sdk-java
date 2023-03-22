package top.iserv.shareable.models;

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
    //@JSONField(deserializeUsing = BindRespReceiverValueDeserializer.class)
    private String receiver;

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

    @Override
    public String toString() {
        return "BindRespModel{" +
                "mchId='" + mchId + '\'' +
                ", receiver=" + receiver +
                '}';
    }
}
