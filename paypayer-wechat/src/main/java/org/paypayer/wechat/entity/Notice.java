package org.paypayer.wechat.entity;

/**
 * 微信通知
 *
 * @Author leaf
 * 2016/3/11 0011 21:22.
 */
public class Notice {

    /**
     * 返回状态码
     */
    private String return_code;

    /**
     * 返回信息
     */
    private String return_msg;

    /**
     * 众账号ID
     */
    private String appid;

    /**
     * 商户号
     */
    private String mch_id;

    /**
     * 设备号
     */
    private String device_info;

    /**
     * 随机字符串
     */
    private String nonce_str;

    /**
     * 签名
     */
    private String sign;

    /**
     * 业务结果
     */
    private String result_code;

    /**
     * 错误代码
     */
    private String err_code;

    /**
     * 错误代码描述
     */
    private String err_code_des;

    /**
     * 用户标识
     */
    private String openid;

    /**
     * 是否关注公众账号
     */
    private String is_subscribe;

    /**
     * 交易类型
     */
    private String trade_type;

    /**
     * 付款银行
     */
    private String bank_type;

    /**
     * 总金额
     */
    private String total_fee;

    /**
     * 货币种类
     */
    private String fee_type;

    /**
     * 现金支付金额
     */
    private String cash_fee;

    /**
     * 现金支付货币类型
     */
    private String cash_fee_type;

    /**
     * 代金券或立减优惠金额
     */
    private String coupon_fee;

    /**
     * 代金券或立减优惠使用数量
     */
    private String coupon_count;

    /**
     * 微信支付订单号
     */
    private String transaction_id;

    /**
     * 商户订单号
     */
    private String out_trade_no;

    /**
     * 商家数据包
     */
    private String attach;

    /**
     * 支付完成时间
     */
    private String time_end;

    public String getReturn_code() {
        return return_code;
    }

    public Notice setReturn_code(String return_code) {
        this.return_code = return_code;
        return this;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public Notice setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
        return this;
    }

    public String getAppid() {
        return appid;
    }

    public Notice setAppid(String appid) {
        this.appid = appid;
        return this;
    }

    public String getMch_id() {
        return mch_id;
    }

    public Notice setMch_id(String mch_id) {
        this.mch_id = mch_id;
        return this;
    }

    public String getDevice_info() {
        return device_info;
    }

    public Notice setDevice_info(String device_info) {
        this.device_info = device_info;
        return this;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public Notice setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public Notice setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getResult_code() {
        return result_code;
    }

    public Notice setResult_code(String result_code) {
        this.result_code = result_code;
        return this;
    }

    public String getErr_code() {
        return err_code;
    }

    public Notice setErr_code(String err_code) {
        this.err_code = err_code;
        return this;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public Notice setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
        return this;
    }

    public String getOpenid() {
        return openid;
    }

    public Notice setOpenid(String openid) {
        this.openid = openid;
        return this;
    }

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public Notice setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
        return this;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public Notice setTrade_type(String trade_type) {
        this.trade_type = trade_type;
        return this;
    }

    public String getBank_type() {
        return bank_type;
    }

    public Notice setBank_type(String bank_type) {
        this.bank_type = bank_type;
        return this;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public Notice setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
        return this;
    }

    public String getFee_type() {
        return fee_type;
    }

    public Notice setFee_type(String fee_type) {
        this.fee_type = fee_type;
        return this;
    }

    public String getCash_fee() {
        return cash_fee;
    }

    public Notice setCash_fee(String cash_fee) {
        this.cash_fee = cash_fee;
        return this;
    }

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public Notice setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
        return this;
    }

    public String getCoupon_fee() {
        return coupon_fee;
    }

    public Notice setCoupon_fee(String coupon_fee) {
        this.coupon_fee = coupon_fee;
        return this;
    }

    public String getCoupon_count() {
        return coupon_count;
    }

    public Notice setCoupon_count(String coupon_count) {
        this.coupon_count = coupon_count;
        return this;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public Notice setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
        return this;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public Notice setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
        return this;
    }

    public String getAttach() {
        return attach;
    }

    public Notice setAttach(String attach) {
        this.attach = attach;
        return this;
    }

    public String getTime_end() {
        return time_end;
    }

    public Notice setTime_end(String time_end) {
        this.time_end = time_end;
        return this;
    }
}
