package top.iserv.shareable.response;

import top.iserv.shareable.AbstractResponse;
import top.iserv.shareable.models.RefundInquiryRespModel;

public class RefundInquiryResponse extends AbstractResponse {

    private static final long serialVersionUID = 3951463415342873770L;

    private RefundInquiryRespModel data;

    public RefundInquiryRespModel getData() {
        return data;
    }

    public void setData(RefundInquiryRespModel data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RefundInquiryResponse{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                '}';
    }
}
