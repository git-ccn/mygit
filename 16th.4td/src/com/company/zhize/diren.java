package com.company.zhize;/*
&学号         2019110502
&姓名           陈诺
&邮箱          2252390142@qq.com
&地址          宿州学院
&课程          java程序设计
*/

public class diren {
    private int nummber;
    private String guimo;

    public diren(int nummber, String guimo) {
        this.nummber = nummber;
        this.guimo = guimo;
    }

    public void setNummber(int nummber) {
        this.nummber = nummber;
    }

    public int getNummber() {
        return nummber;
    }

    public String getGuimo() {
        return this.guimo;
    }

    public void setGuimo(String guimo) {
        this.guimo = guimo;
    }
}
