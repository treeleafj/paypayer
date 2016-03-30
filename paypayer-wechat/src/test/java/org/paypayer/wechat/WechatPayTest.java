package org.paypayer.wechat;

import org.junit.Test;
import org.paypayer.wechat.entity.UnifiedOrder;

import static org.junit.Assert.*;

/**
 * Created by yaoshuhong on 2016/3/30.
 */
public class WechatPayTest {

    @Test
    public void testUnifiedorder() throws Exception {
        WechatPay wechatPay = new WechatPay();
        wechatPay.setAppid("123");
        wechatPay.setKey("123");
        wechatPay.setMerchantNo("123");
        UnifiedOrder order = new UnifiedOrder();
        order.setAppid("123");
        wechatPay.unifiedorder(order);
    }

    @Test
    public void testNotice() throws Exception {

    }

    @Test
    public void testJsapi() throws Exception {

    }
}