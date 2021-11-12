package com.company.zhize;/*
&学号         2019110502
&姓名           陈诺
&邮箱          2252390142@qq.com
&地址          宿州学院
&课程          java程序设计
*/

public class PlatoonLeader extends Shangji {
    public PlatoonLeader(String name) {
        super(name);
    }

    @Override
    public void processRequest(diren d) {
        if (d.getNummber() >= 10 && d.getNummber() < 50) {
            System.out.println(name + "下达命令");
        }
        else {
            this.successor.processRequest(d);
        }
    }
}
