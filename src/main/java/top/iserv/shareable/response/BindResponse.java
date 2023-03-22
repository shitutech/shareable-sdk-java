package top.iserv.shareable.response;

import top.iserv.shareable.AbstractResponse;
import top.iserv.shareable.models.BindRespModel;

public class BindResponse extends AbstractResponse {
    /**
     * 分账接收方信息
     */
    private BindRespModel data;

    private static final long serialVersionUID = 5375863652478591660L;

    public BindRespModel getData() {
        return data;
    }

    public void setData(BindRespModel data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BindResponse{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                '}';
    }
}
