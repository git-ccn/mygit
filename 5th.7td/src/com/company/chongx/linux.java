package com.company.chongx;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public class linux implements Factory {
    @Override
    public Button bt() {
        return new LinuxButton();
    }

    @Override
    public text te() {
        return new Linuxtext();
    }
}

