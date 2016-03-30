package org.paypayer.chinabank;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.treeleaf.common.safe.Hex;
import org.treeleaf.common.template.Templater;
import org.treeleaf.common.template.VelocityTemplater;

import java.util.HashMap;
import java.util.Map;

/**
 * 网银在线
 * <p>
 * Created by yaoshuhong on 2016/3/30.
 */
public class ChinaBank {

    private Logger log = LoggerFactory.getLogger(ChinaBank.class);

    /**
     * 网银在线支付地址
     */
    protected String payUrl = "https://pay3.chinabank.com.cn/PayGate";

    /**
     * md5签名key
     */
    protected String key;

    /**
     * 商户编号
     */
    protected String merchantNo;

    /**
     * 返回商户页面的地址
     */
    protected String returnUrl;

    /**
     * 后台异步通知商户的地址
     */
    protected String noticeUrl;

    public PayPage buildPayPage(PayParam payParam) {

        String text = payParam.getAmount() + payParam.getCurrency() + payParam.getOrderNo() + merchantNo + returnUrl + key;
        String md5info = Hex.md5(text).toUpperCase();

        Map<String, String> param = new HashMap<>();
        param.put("v_mid", merchantNo);
        param.put("v_oid", payParam.getOrderNo());
        param.put("v_amount", payParam.getAmount().toString());
        param.put("v_moneytype", payParam.getCurrency());
        param.put("v_url", returnUrl);
        param.put("v_md5info", md5info);
        param.put("encoding", "utf-8");

        if (StringUtils.isNotBlank(payParam.getBankNo())) {//有银行编号表示直连,无银行编号表示非直连
            param.put("pmode_id", payParam.getBankNo());
        }

        if (StringUtils.isNotBlank(noticeUrl)) {
            param.put("remark2", "[url:=" + noticeUrl + "]");
        }

        Map model = new HashMap<>();
        model.put("url", payUrl);
        model.put("param", param);
        model.put("method", "POST");

        Templater templater = new VelocityTemplater("org/paypayer/chinabank/commonPayPage.vm");

        String content = templater.parse(model);
        PayPage payPage = new PayPage();
        payPage.setCharset("GBK");
        payPage.setContent(content);

        return payPage;
    }

    public PayResult returnValid(Map<String, String> returnParam) {

        String v_oid = returnParam.get("v_oid");        // 订单号
        String v_pmode = returnParam.get("v_pmode");        // 支付方式中文说明，如"中行长城信用卡"
        String v_pstatus = returnParam.get("v_pstatus");    // 支付结果，20支付完成；30支付失败；
        String v_pstring = returnParam.get("v_pstring");    // 对支付结果的说明，成功时（v_pstatus=20）为"支付成功"，支付失败时（v_pstatus=30）为"支付失败"
        String v_amount = returnParam.get("v_amount");        // 订单实际支付金额
        String v_moneytype = returnParam.get("v_moneytype");    // 币种
        String v_md5str = returnParam.get("v_md5str");        // MD5校验码
        String remark1 = returnParam.get("remark1");        // 备注1
        String remark2 = returnParam.get("remark2");        // 备注2

        String text = v_oid + v_pstatus + v_amount + v_moneytype + key;
        String sign = Hex.md5(text).toUpperCase();

        if (!v_md5str.equals(sign)) {//验签失败
            log.error("验签失败,我们的签名:{}, 网银在线的签名:{}", sign, v_md5str);
            throw new RuntimeException("网银在线返回数据验签失败");
        }

        PayResult payResult = new PayResult();
        payResult.setOrderNo(v_oid);
        payResult.setAmount(Double.valueOf(v_amount));
        payResult.setCode(v_pstatus);
        payResult.setMsg(v_pstring);

        if ("20".equals(v_pstatus)) {
            payResult.setPayStatus(PayStatus.OK);
        } else {
            payResult.setPayStatus(PayStatus.FAIL);
        }

        return payResult;
    }

    public PayResult noticeValid(Map<String, String> noticeParam) {
        return this.returnValid(noticeParam);
    }
}
