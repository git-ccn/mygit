package com.company.chongx;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public class Windows implements Factory {
    @Override
    public Button bt() {
        return new WindowsButton();
    }

    @Override
    public text te() {
        return new Windowstext();
    }
}

