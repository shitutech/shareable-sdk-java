package top.iserv.shareable.request;

import top.iserv.shareable.AbstractRequest;

public class SharingInquiryRequest extends AbstractRequest {
    /**
     * 收单商户号
     */
    private String mchId;

    /**
     * 分账单号，分账方的分账订单号
     */
    private String mchSharingNo;

    @Override
    public String getApiUri() {
        return "/api/sharing/inquiry";
    }

    public String getMchId() {
        return mchId;
    }

    public SharingInquiryRequest setMchId(String mchId) {
        this.mchId = mchId == null ? "" : mchId.trim();

        return this;
    }

    public String getMchSharingNo() {
        return mchSharingNo;
    }

    public SharingInquiryRequest setMchSharingNo(String mchSharingNo) {
        this.mchSharingNo = mchSharingNo == null ? "" : mchSharingNo.trim();

        return this;
    }

    @Override
    public String toString() {
        return "SharingInquiryRequest{" +
                "mchId='" + mchId + '\'' +
                ", mchSharingNo='" + mchSharingNo + '\'' +
                '}';
    }
}
