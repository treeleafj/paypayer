package org.paypayer.wechat.entity;

/**
 * @Author leaf
 * 2016/3/12 0012 0:42.
 */
public class JsapiParam {

    /**
     * 应用id
     */
    private String appId;

    /**
     * 时间戳
     */
    private String timeStamp;

    /**
     * 随机字符窜
     */
    private String nonceStr;

    /**
     * 支付预处理id
     */
    private String pk;

    /**
     * 签名类型
     */
    private String signType;

    /**
     * 支付签名
     */
    private String paySign;

    /**
     * 订单号
     */
    private String orderno;

    public String getAppId() {
        return appId;
    }

    public JsapiParam setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public JsapiParam setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public JsapiParam setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
        return this;
    }

    public String getPk() {
        return pk;
    }

    public JsapiParam setPk(String pk) {
        this.pk = pk;
        return this;
    }

    public String getSignType() {
        return signType;
    }

    public JsapiParam setSignType(String signType) {
        this.signType = signType;
        return this;
    }

    public String getPaySign() {
        return paySign;
    }

    public JsapiParam setPaySign(String paySign) {
        this.paySign = paySign;
        return this;
    }

    public String getOrderno() {
        return orderno;
    }

    public JsapiParam setOrderno(String orderno) {
        this.orderno = orderno;
        return this;
    }
}
