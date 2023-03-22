package top.iserv.shareable.models;

import java.io.Serializable;

public class RefundRespModel implements Serializable {

    private static final long serialVersionUID = 5661989108992849350L;

    /**
     * 收单商户号
     */
    private String mchId;

    /**
     * 分账单号，分账方的分账订单号
     */
    private String mchSharingNo;

    /**
     * 商户回退单号
     */
    private String mchReturnNo;

    /**
     * 上游回退单号
     */
    private String returnNo;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getMchSharingNo() {
        return mchSharingNo;
    }

    public void setMchSharingNo(String mchSharingNo) {
        this.mchSharingNo = mchSharingNo;
    }

    public String getMchReturnNo() {
        return mchReturnNo;
    }

    public void setMchReturnNo(String mchReturnNo) {
        this.mchReturnNo = mchReturnNo;
    }

    public String getReturnNo() {
        return returnNo;
    }

    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
    }

    @Override
    public String toString() {
        return "RefundRespModel{" +
                "mchId='" + mchId + '\'' +
                ", mchSharingNo='" + mchSharingNo + '\'' +
                ", mchReturnNo='" + mchReturnNo + '\'' +
                ", returnNo='" + returnNo + '\'' +
                '}';
    }
}
