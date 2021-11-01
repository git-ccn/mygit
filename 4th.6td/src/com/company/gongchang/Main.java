package com.company.gongchang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory;
        logger log;
        factory = (Factory) XMLUtil.getBean();
        log = factory.creatlogger();
        log.zhuanghu();
    }
}
