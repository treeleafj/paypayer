package org.paypayer.wechat.entity;

/**
 * @Author leaf
 * 2016/3/11 0011 20:58.
 */
public class UnifiedOrder {

    /**
     * 微信分配的公众账号ID
     */
    private String appid;

    /**
     * 微信支付分配的商户号
     */
    private String mch_id;

    /**
     * 终端设备号(门店号或收银设备ID)，注意：PC网页或公众号内支付请传"WEB"
     */
    private String device_info;

    /**
     * 随机字符串，不长于32位
     */
    private String nonce_str;

    /**
     * 签名
     */
    private String sign;

    /**
     * 商品或支付单简要描述
     */
    private String body;

    /**
     * 商户系统内部的订单号,32个字符内、可包含字母
     */
    private String out_trade_no;

    /**
     * 符合ISO 4217标准的三位字母代码，默认人民币：CNY
     */
    private String fee_type;

    /**
     * 订单总金额，只能为整数
     */
    private String total_fee;

    /**
     * APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP
     */
    private String spbill_create_ip;

    /**
     * 接收微信支付异步通知回调地址
     */
    private String notify_url;

    /**
     * 取值如下：JSAPI，NATIVE，APP，WAP
     */
    private String trade_type;

    /**
     * 用户标识,trade_type=JSAPI，此参数必传
     */
    private String openid;

    public String getAppid() {
        return appid;
    }

    public UnifiedOrder setAppid(String appid) {
        this.appid = appid;
        return this;
    }

    public String getMch_id() {
        return mch_id;
    }

    public UnifiedOrder setMch_id(String mch_id) {
        this.mch_id = mch_id;
        return this;
    }

    public String getDevice_info() {
        return device_info;
    }

    public UnifiedOrder setDevice_info(String device_info) {
        this.device_info = device_info;
        return this;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public UnifiedOrder setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public UnifiedOrder setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getBody() {
        return body;
    }

    public UnifiedOrder setBody(String body) {
        this.body = body;
        return this;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public UnifiedOrder setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
        return this;
    }

    public String getFee_type() {
        return fee_type;
    }

    public UnifiedOrder setFee_type(String fee_type) {
        this.fee_type = fee_type;
        return this;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public UnifiedOrder setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
        return this;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public UnifiedOrder setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
        return this;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public UnifiedOrder setNotify_url(String notify_url) {
        this.notify_url = notify_url;
        return this;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public UnifiedOrder setTrade_type(String trade_type) {
        this.trade_type = trade_type;
        return this;
    }

    public String getOpenid() {
        return openid;
    }

    public UnifiedOrder setOpenid(String openid) {
        this.openid = openid;
        return this;
    }
}