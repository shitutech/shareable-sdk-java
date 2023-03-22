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
    private String receiver;
}
