package org.paypayer.chinabank;

/**
 * @Author leaf
 * 2015/9/3 0003 1:41.
 */
public class PayPage {

    /**
     * 页面编码
     */
    private String charset = "utf-8";

    /**
     * 页面内容,一般为html
     */
    private String content;

    public String getCharset() {
        return charset;
    }

    public PayPage setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getContent() {
        return content;
    }

    public PayPage setContent(String content) {
        this.content = content;
        return this;
    }
}
