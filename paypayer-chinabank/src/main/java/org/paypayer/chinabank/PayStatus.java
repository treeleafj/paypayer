package org.paypayer.chinabank;

/**
 * 支付状态
 *
 * @Author leaf
 * 2015/9/4 0004 12:09.
 */
public enum PayStatus {


    /**
     * 未支付
     */
    NONE("0"),

    /**
     * 支付成功
     */
    OK("1"),

    /**
     * 支付失败
     */
    FAIL("2");

    private String value;

    PayStatus(String value) {
        this.value = value;
    }

    /**
     * 将字符串的支付方式转换为PayStatus对象
     *
     * @param v 0-未支付, 1-支付中, 2-支付成功, 30支付失败
     * @return
     */
    public static PayStatus parse(String v) {
        for (PayStatus status : PayStatus.values()) {
            if (status.value.equals(v)) {
                return status;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }
}
