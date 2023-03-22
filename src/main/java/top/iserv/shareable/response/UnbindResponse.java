package top.iserv.shareable.response;

import top.iserv.shareable.AbstractResponse;
import top.iserv.shareable.models.BindRespModel;

public class UnbindResponse extends AbstractResponse {

    private static final long serialVersionUID = 6045788933303200L;

    /**
     * 分账接收方信息
     */
    private BindRespModel data;

    public BindRespModel getData() {
        return data;
    }

    public void setData(BindRespModel data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UnbindResponse{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                '}';
    }
}
