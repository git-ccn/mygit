package com.company.waiguan;

public class Main {
    public static void main(String[] args) {
	// write your code here
        absFacade af;
        af = (absFacade) XMLUtil.getBean();
        af.xitong();
    }
}
