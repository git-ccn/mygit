package com.company.chongx;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory;
        OperationController ope;
        InterfaceContraller ier;
        factory = (Factory) XMLUtil.getBean();
        ope = factory.op();
        ier = factory.it();
        ope.lo();
        ier.li();
    }
}
