package com.company.jianzao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-15
 */

public abstract class computerBuilder {
    computer com = new computer();

    public abstract void buildType();

    public abstract void buildCPU();

    public abstract void buildMemory();

    public abstract void buildHd();

    public abstract void buildMainframe();

    public abstract void buildDisplay();

    public computer creatcom() {
        return com;
    }
}

