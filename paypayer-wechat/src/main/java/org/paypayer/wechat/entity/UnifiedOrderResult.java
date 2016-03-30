package org.paypayer.wechat.entity;

/**
 * 微信统一下单接口出参
 *
 * @Author leaf
 * 2016/3/11 0011 20:59.
 */
public class UnifiedOrderResult {


    /**
     * SUCCESS/FAIL,此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     */
    private String return_code;

    /**
     * 返回信息，如非空，为错误原因:签名失败,参数格式校验错误
     */
    private String return_msg;

    //以下字段在return_code为SUCCESS的时候有返回

    /**
     * 调用接口提交的公众账号ID
     */
    private String appid;

    /**
     * 调用接口提交的商户号
     */
    private String mch_id;

    /**
     * 调用接口提交的终端设备号
     */
    private String device_info;

    /**
     * 微信返回的随机字符串
     */
    private String nonce_str;

    /**
     * 微信返回的签名
     */
    private String sign;

    /**
     * 业务结果 SUCCESS/FAIL
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

    //以下字段在return_code 和result_code都为SUCCESS的时候有返回

    /**
     * 交易类型:JSAPI，NATIVE，APP
     */
    private String trade_type;

    /**
     * 预支付交易会话标识
     */
    private String prepay_id;

    /**
     * 二维码链接
     */
    private String code_url;

    /**
     * 商户系统内部的订单号,32个字符内、可包含字母
     */
    private String out_trade_no;

    public String getReturn_code() {
        return return_code;
    }

    public UnifiedOrderResult setReturn_code(String return_code) {
        this.return_code = return_code;
        return this;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public UnifiedOrderResult setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
        return this;
    }

    public String getAppid() {
        return appid;
    }

    public UnifiedOrderResult setAppid(String appid) {
        this.appid = appid;
        return this;
    }

    public String getMch_id() {
        return mch_id;
    }

    public UnifiedOrderResult setMch_id(String mch_id) {
        this.mch_id = mch_id;
        return this;
    }

    public String getDevice_info() {
        return device_info;
    }

    public UnifiedOrderResult setDevice_info(String device_info) {
        this.device_info = device_info;
        return this;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public UnifiedOrderResult setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public UnifiedOrderResult setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getResult_code() {
        return result_code;
    }

    public UnifiedOrderResult setResult_code(String result_code) {
        this.result_code = result_code;
        return this;
    }

    public String getErr_code() {
        return err_code;
    }

    public UnifiedOrderResult setErr_code(String err_code) {
        this.err_code = err_code;
        return this;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public UnifiedOrderResult setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
        return this;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public UnifiedOrderResult setTrade_type(String trade_type) {
        this.trade_type = trade_type;
        return this;
    }

    public String getPrepay_id() {
        return prepay_id;
    }

    public UnifiedOrderResult setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
        return this;
    }

    public String getCode_url() {
        return code_url;
    }

    public UnifiedOrderResult setCode_url(String code_url) {
        this.code_url = code_url;
        return this;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public UnifiedOrderResult setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
        return this;
    }
}
