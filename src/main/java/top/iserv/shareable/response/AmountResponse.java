package top.iserv.shareable.response;

import top.iserv.shareable.AbstractResponse;
import top.iserv.shareable.models.AmountRespModel;

public class AmountResponse extends AbstractResponse {
    private static final long serialVersionUID = -3039833666557881030L;

    private AmountRespModel data;

    public AmountRespModel getData() {
        return data;
    }
    
    public void setData(AmountRespModel data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AmountResponse{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                '}';
    }
}

