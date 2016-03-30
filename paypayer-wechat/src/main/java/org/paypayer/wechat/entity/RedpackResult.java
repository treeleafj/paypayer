package org.paypayer.wechat.entity;

/**
 * Created by leaf on 2016/3/17 0017.
 */
public class RedpackResult {

    /**
     * 返回状态码, SUCCESS/FAIL, 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     */
    private String return_code;

    /**
     * 返回信息，如非空:为错误原因,签名失败,参数格式校验错误
     */
    private String return_msg;

    /**以下字段在return_code为SUCCESS的时候有返回*/

    /**
     * 签名
     */
    private String sign;

    /**
     * 业务结果, SUCCESS/FAIL
     */
    private String result_code;

    /**
     * 错误码信息
     */
    private String err_code;

    /**
     * 结果信息描述
     */
    private String err_code_des;

    /**
     * 商户订单号（每个订单号必须唯一）组成：mch_id+yyyymmdd+10位一天内不能重复的数字
     */
    private String mch_billno;

    /**
     * 微信支付分配的商户号
     */
    private String mch_id;

    /**
     * 商户appid，接口传入的所有appid应该为公众号的appid（在mp.weixin.qq.com申请的），不能为APP的appid（在open.weixin.qq.com申请的）。
     */
    private String wxappid;

    /**
     * 用户openid,接受收红包的用户,用户在wxappid下的openid
     */
    private String re_openid;

    /**
     * 付款金额，单位分
     */
    private String total_amount;

    /**
     * 红包发送时间,20150520102602
     */
    private String send_time;

    /**
     * 红包订单的微信单号,100000000020150520314766074200
     */
    private String send_listid;

    public String getReturn_code() {
        return return_code;
    }

    public RedpackResult setReturn_code(String return_code) {
        this.return_code = return_code;
        return this;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public RedpackResult setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public RedpackResult setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getResult_code() {
        return result_code;
    }

    public RedpackResult setResult_code(String result_code) {
        this.result_code = result_code;
        return this;
    }

    public String getErr_code() {
        return err_code;
    }

    public RedpackResult setErr_code(String err_code) {
        this.err_code = err_code;
        return this;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public RedpackResult setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
        return this;
    }

    public String getMch_billno() {
        return mch_billno;
    }

    public RedpackResult setMch_billno(String mch_billno) {
        this.mch_billno = mch_billno;
        return this;
    }

    public String getMch_id() {
        return mch_id;
    }

    public RedpackResult setMch_id(String mch_id) {
        this.mch_id = mch_id;
        return this;
    }

    public String getWxappid() {
        return wxappid;
    }

    public RedpackResult setWxappid(String wxappid) {
        this.wxappid = wxappid;
        return this;
    }

    public String getRe_openid() {
        return re_openid;
    }

    public RedpackResult setRe_openid(String re_openid) {
        this.re_openid = re_openid;
        return this;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public RedpackResult setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
        return this;
    }

    public String getSend_time() {
        return send_time;
    }

    public RedpackResult setSend_time(String send_time) {
        this.send_time = send_time;
        return this;
    }

    public String getSend_listid() {
        return send_listid;
    }

    public RedpackResult setSend_listid(String send_listid) {
        this.send_listid = send_listid;
        return this;
    }
}
