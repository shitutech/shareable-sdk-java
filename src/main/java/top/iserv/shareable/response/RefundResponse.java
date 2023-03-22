package top.iserv.shareable.response;

import top.iserv.shareable.AbstractResponse;
import top.iserv.shareable.models.RefundRespModel;

public class RefundResponse extends AbstractResponse {

    private static final long serialVersionUID = 2553250948094669945L;

    private RefundRespModel data;

    public RefundRespModel getData() {
        return data;
    }

    public void setData(RefundRespModel data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RefundResponse{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                '}';
    }
}
