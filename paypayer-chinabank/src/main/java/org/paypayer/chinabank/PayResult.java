package org.paypayer.chinabank;

/**
 * 支付结果
 *
 * @Author leaf
 * 2015/9/4 0004 12:08.
 */
public class PayResult {

    /**
     * 支付订单号
     */
    private String orderNo;

    /**
     * 支付状态
     */
    private PayStatus payStatus;

    /**
     * 支付金额
     */
    private Double amount;

    /**
     * 通道返回码
     */
    private String code;

    /**
     * 通道返回描述
     */
    private String msg;

    public String getOrderNo() {
        return orderNo;
    }

    public PayResult setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    public PayStatus getPayStatus() {
        return payStatus;
    }

    public PayResult setPayStatus(PayStatus payStatus) {
        this.payStatus = payStatus;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public PayResult setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public String getCode() {
        return code;
    }

    public PayResult setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public PayResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
