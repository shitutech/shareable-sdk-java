package top.iserv.shareable.response;

import top.iserv.shareable.AbstractResponse;
import top.iserv.shareable.models.SharingInquiryRespModel;

public class SharingInquiryResponse extends AbstractResponse {

    private static final long serialVersionUID = 5415552357354851700L;

    private SharingInquiryRespModel data;

    public SharingInquiryRespModel getData() {
        return data;
    }

    public void setData(SharingInquiryRespModel data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SharingInquiryResponse{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                '}';
    }
}
