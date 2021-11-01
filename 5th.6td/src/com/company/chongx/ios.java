package com.company.chongx;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public class ios implements Factory {
    @Override
    public InterfaceContraller it() {
        return new Iios();
    }

    @Override
    public OperationController op() {
        return new lios();
    }
}

