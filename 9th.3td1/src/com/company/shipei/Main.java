package com.company.shipei;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataUse dataUse = new CipherAdapter();
        dataUse.setPassword("123456");
        String psd = dataUse.getPassword();
        String str = dataUse.doEnctypt();
        System.out.println("password："+psd);
        System.out.println(str);
    }
}
