package com.company.shipei;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public abstract class DataUse {
    //目标抽象类
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    //加密
    public abstract String doEnctypt();
}

