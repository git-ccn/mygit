package com.company.zhize;/*
&学号         2019110502
&姓名           陈诺
&邮箱          2252390142@qq.com
&地址          宿州学院
&课程          java程序设计
*/

public abstract class Shangji {
    public Shangji successor;
    public String name;

    public Shangji(String name) {
        this.name = name;
    }

    public void setSuccessor(Shangji successor) {
        this.successor = successor;
    }

    public abstract void processRequest(diren d);
}
