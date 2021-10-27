package com.company.jianzao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-15
 */

public class Factory {
    public computer construct(computerBuilder cb){
        computer computer;
        cb.buildType();
        computer = cb.creatcom();
        return computer;
    }
}

