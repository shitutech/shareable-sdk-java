package top.iserv.shareable;

import java.io.Serializable;

public abstract class AbstractResponse implements Serializable {
    /**
     * 状态， 200 表示业务处理成功，否则表示失败
     */
    protected int code;

    /**
     * 错误描述信息
     */
    protected String msg;

    /**
     * 接口响应的数据，数据结构由各个接口定义
     */
    // protected Object data;

    /**
     * 请求的随机字符串
     */
    protected String nonceStr;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    @Override
    public String toString() {
        return "AbstractResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                '}';
    }
}
