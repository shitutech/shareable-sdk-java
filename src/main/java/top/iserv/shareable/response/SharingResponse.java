package top.iserv.shareable.response;

import top.iserv.shareable.AbstractResponse;
import top.iserv.shareable.models.SharingRespModel;

public class SharingResponse extends AbstractResponse {

    private static final long serialVersionUID = -6447877567321943631L;

    private SharingRespModel data;

    public SharingRespModel getData() {
        return data;
    }

    public void setData(SharingRespModel data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SharingResponse{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                '}';
    }
}
