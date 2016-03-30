package org.paypayer.chinabank;

import java.util.Collections;
import java.util.Map;

/**
 * @Author leaf
 * 2015/9/3 0003 1:34.
 */
public class PayParam {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 支付金额
     */
    private Double amount;

    /**
     * 币种,默认是CNY人民币
     */
    private String currency = "CNY";

    /**
     * 支付银行
     */
    private String bankNo;

    /**
     * 客户端ip
     */
    private String clientIp;

    /**
     * 支付产品名称
     */
    private String productName;

    private Map<String, String> other = Collections.EMPTY_MAP;

    public String getOrderNo() {
        return orderNo;
    }

    public PayParam setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public PayParam setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public PayParam setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getBankNo() {
        return bankNo;
    }

    public PayParam setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }

    public String getClientIp() {
        return clientIp;
    }

    public PayParam setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public PayParam setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public Map<String, String> getOther() {
        return other;
    }

    public PayParam setOther(Map<String, String> other) {
        this.other = other;
        return this;
    }
}
