package top.iserv.shareable.request;

import top.iserv.shareable.AbstractRequest;

public class RefundInquiryRequest extends AbstractRequest {
    /**
     * 收单商户号
     */
    private String mchId;

    /**
     * 商户回退单号
     */
    private String mchReturnNo;

    @Override
    public String getApiUri() {
        return "/api/sharing/refund/inquiry";
    }

    public String getMchId() {
        return mchId;
    }

    public RefundInquiryRequest setMchId(String mchId) {
        this.mchId = mchId == null ? "" : mchId.trim();

        return this;
    }

    public String getMchReturnNo() {
        return mchReturnNo;
    }

    public RefundInquiryRequest setMchReturnNo(String mchReturnNo) {
        this.mchReturnNo = mchReturnNo == null ? "" : mchReturnNo.trim();

        return this;
    }

    @Override
    public String toString() {
        return "RefundInquiryRequest{" +
                "mchId='" + mchId + '\'' +
                ", mchReturnNo='" + mchReturnNo + '\'' +
                '}';
    }
}
