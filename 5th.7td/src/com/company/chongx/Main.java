package com.company.chongx;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory;
        Button button;
        text tx;
        factory = (Factory) XMLUtil.getBean();
        button = factory.bt();
        tx = factory.te();
        button.display();
        tx.display();
    }
}
