package com.company.chongx;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public class mysql implements shujuku {
    @Override
    public Connection creatC() {
        return new mysqlC();
    }

    @Override
    public Statement creatS() {
        return new mysqlS();
    }
}

