package com.company.gongchang;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：
 */

public class excelfactory implements Factory {
    @Override
    public logger creatlogger() {
        logger lo = new Excel();
        return lo;
    }
}

