package com.company.chongx;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public class Android implements Factory {
    @Override
    public InterfaceContraller it() {
        return new IAndroid();
    }

    @Override
    public OperationController op() {
        return new lAndroid();
    }
}

