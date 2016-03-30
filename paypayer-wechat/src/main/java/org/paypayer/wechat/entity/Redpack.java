package org.paypayer.wechat.entity;

/**
 * Created by leaf on 2016/3/17 0017.
 */
public class Redpack {

    /**
     * 随机字符串,不长于32位
     */
    private String nonce_str;

    /**
     * 签名
     */
    private String sign;

    /**
     * 商户订单号,（每个订单号必须唯一） 组成：mch_id+yyyymmdd+10位一天内不能重复的数字。 接口根据商户订单号支持重入，如出现超时可再调用。
     */
    private String mch_billno;

    /**
     * 商户号,微信支付分配的商户号
     */
    private String mch_id;

    /**
     * 公众账号appid,微信分配的公众账号ID（企业号corpid即为此appId）。接口传入的所有appid应该为公众号的appid（在mp.weixin.qq.com申请的），不能为APP的appid（在open.weixin.qq.com申请的）。
     */
    private String wxappid;

    /**
     * 商户名称,红包发送者名称
     */
    private String send_name;

    /**
     * 用户openid,接受红包的用户,用户在wxappid下的openid
     */
    private String re_openid;

    /**
     * 付款金额,付款金额，单位分
     */
    private String total_amount;

    /**
     * 红包发放总人数, 红包发放总人数 total_num=1
     */
    private String total_num;

    /**
     * 红包祝福语,例如:感谢您参加猜灯谜活动，祝您元宵节快乐！
     */
    private String wishing;

    /**
     * 调用接口的机器Ip地址
     */
    private String client_ip;

    /**
     * 活动名称
     */
    private String act_name;

    /**
     * 备注
     */
    private String remark;

    public String getNonce_str() {
        return nonce_str;
    }

    public Redpack setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public Redpack setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getMch_billno() {
        return mch_billno;
    }

    public Redpack setMch_billno(String mch_billno) {
        this.mch_billno = mch_billno;
        return this;
    }

    public String getMch_id() {
        return mch_id;
    }

    public Redpack setMch_id(String mch_id) {
        this.mch_id = mch_id;
        return this;
    }

    public String getWxappid() {
        return wxappid;
    }

    public Redpack setWxappid(String wxappid) {
        this.wxappid = wxappid;
        return this;
    }

    public String getSend_name() {
        return send_name;
    }

    public Redpack setSend_name(String send_name) {
        this.send_name = send_name;
        return this;
    }

    public String getRe_openid() {
        return re_openid;
    }

    public Redpack setRe_openid(String re_openid) {
        this.re_openid = re_openid;
        return this;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public Redpack setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
        return this;
    }

    public String getTotal_num() {
        return total_num;
    }

    public Redpack setTotal_num(String total_num) {
        this.total_num = total_num;
        return this;
    }

    public String getWishing() {
        return wishing;
    }

    public Redpack setWishing(String wishing) {
        this.wishing = wishing;
        return this;
    }

    public String getClient_ip() {
        return client_ip;
    }

    public Redpack setClient_ip(String client_ip) {
        this.client_ip = client_ip;
        return this;
    }

    public String getAct_name() {
        return act_name;
    }

    public Redpack setAct_name(String act_name) {
        this.act_name = act_name;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public Redpack setRemark(String remark) {
        this.remark = remark;
        return this;
    }
}
