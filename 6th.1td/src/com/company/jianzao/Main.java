package com.company.jianzao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        computerBuilder cb;
        cb = (computerBuilder)XMLUtil.getBean();

        Factory factory = new Factory();
        computer computer;
        computer = factory.construct(cb);

        String type = computer.getType();
        System.out.println(type);
    }
}
