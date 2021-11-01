package com.company.chongx;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public class UNXI implements Factory {
    @Override
    public Button bt() {
        return new UNIXButton();
    }

    @Override
    public text te() {
        return new UNIXTtext();
    }
}

