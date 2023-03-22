package top.iserv.shareable.client;

import com.alibaba.fastjson.JSON;
import top.iserv.shareable.AbstractClient;
import top.iserv.shareable.Config;
import top.iserv.shareable.models.BindRespModel;
import top.iserv.shareable.models.ReceiverModel;
import top.iserv.shareable.models.SharingInquiryReceiverModel;
import top.iserv.shareable.models.SharingInquiryRespModel;
import top.iserv.shareable.request.*;
import top.iserv.shareable.response.*;

import java.util.List;

public class Client extends AbstractClient {
    public Client(Config config) {
        super(config);
    }

    public BindResponse bind(BindRequest request) {
        String respData = send(request);

        BindResponse response = JSON.parseObject(respData, BindResponse.class);

        BindRespModel respModel = response.getData();

        if (respModel != null && respModel.getReceiver() != null) {
            ReceiverModel receiverModel = JSON.parseObject(respModel.getReceiver(), ReceiverModel.class);
            response.getData().setReceiverModel(receiverModel);
        }

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    public UnbindResponse unbind(UnbindRequest request) {
        String respData = send(request);

        UnbindResponse response = JSON.parseObject(respData, UnbindResponse.class);

        BindRespModel respModel = response.getData();

        if (respModel != null && respModel.getReceiver() != null) {
            ReceiverModel receiverModel = JSON.parseObject(respModel.getReceiver(), ReceiverModel.class);
            response.getData().setReceiverModel(receiverModel);
        }

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    public AmountResponse amountInquiry(AmountRequest request) {
        String respData = send(request);

        AmountResponse response = JSON.parseObject(respData, AmountResponse.class);

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    public SharingResponse sharing(SharingRequest request) {
        String respData = send(request);

        SharingResponse response = JSON.parseObject(respData, SharingResponse.class);

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    public SharingInquiryResponse sharingInquiry(SharingInquiryRequest request) {
        String respData = send(request);

        SharingInquiryResponse response = JSON.parseObject(respData, SharingInquiryResponse.class);

        SharingInquiryRespModel respModel = response.getData();

        if (respModel != null && respModel.getReceivers() != null) {
            List<SharingInquiryReceiverModel> receiverModel = JSON.parseArray(respModel.getReceivers(), SharingInquiryReceiverModel.class);
            response.getData().setReceiverModel(receiverModel);
        }

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    public RefundResponse refund(RefundRequest request) {
        String respData = send(request);

        RefundResponse response = JSON.parseObject(respData, RefundResponse.class);

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    public RefundInquiryResponse refundInquiry(RefundInquiryRequest request) {
        String respData = send(request);

        RefundInquiryResponse response = JSON.parseObject(respData, RefundInquiryResponse.class);

        checkBizCode(response.getCode(), response.getMsg());

        return response;
    }

    private void checkBizCode(int code, String errMsg) {
        if (code != 200) {
            throw new RuntimeException("业务请求响应抛出异常。Err: " + code + "::" + errMsg);
        }
    }
}
