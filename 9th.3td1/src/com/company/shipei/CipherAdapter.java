package com.company.shipei;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public class CipherAdapter extends DataUse {
    private final Cipher cipher;

    public CipherAdapter() {
        cipher = new Cipher();
    }

    //有参构造方法
    public CipherAdapter(Cipher cipher) {
        super();
        this.cipher = cipher;
    }

    @Override
    public String doEnctypt() {
        return cipher.doEncrypt();
    }
}

