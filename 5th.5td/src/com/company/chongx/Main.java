package com.company.chongx;

public class Main {

    public static void main(String[] args) {
	// write your code here
        shujuku sjk;
        Connection C;
        Statement S;
        sjk = (shujuku) XMLUtil.getBean();
        C = sjk.creatC();
        S = sjk.creatS();
        C.lc();
        S.ls();
    }
}
