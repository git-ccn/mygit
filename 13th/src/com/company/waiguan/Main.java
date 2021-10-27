package com.company.waiguan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Mainframe mf = new Mainframe();
            mf.on();
        }catch (Exception e){
            System.out.println("启动错误");
        }
    }
}
