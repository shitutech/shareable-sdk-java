package top.iserv.shareable.request;

import com.alibaba.fastjson2.annotation.JSONField;
import top.iserv.shareable.AbstractRequest;
import top.iserv.shareable.models.ReceiverModel;
import top.iserv.shareable.serializers.RequestModelJsonValueSerializer;

public class BindRequest extends AbstractRequest {
    /**
     * 收单商户号
     */
    private String mchId;

    /**
     * 分账接收方信息
     */
    @JSONField(serializeUsing = RequestModelJsonValueSerializer.class)
    public ReceiverModel receiver;

    @Override
    public String getApiUri() {
        return "/api/sharing/receiver/bind";
    }

    public String getMchId() {
        return mchId;
    }

    public BindRequest setMchId(String mchId) {
        this.mchId = mchId == null ? "" : mchId.trim();

        return this;
    }

    public ReceiverModel getReceiver() {
        return receiver;
    }

    public BindRequest setReceiver(ReceiverModel receiver) {
        this.receiver = receiver;

        return this;
    }

    @Override
    public String toString() {
        return "BindRequest{" +
                "mchId='" + mchId + '\'' +
                ", receiver=" + receiver +
                '}';
    }
}
