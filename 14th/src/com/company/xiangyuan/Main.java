package com.company.xiangyuan;
public class Main {
    public static void main(String[] args) {
	// write your code here
        gongxia com1,com2,com3,com4,com5;
        xiangyFactory factory;

        factory = xiangyFactory.getXyf();

        com1 = factory.getgongxia("h");
        com2 = factory.getgongxia("h");
        com3 = factory.getgongxia("h");

        com4 = factory.getgongxia("x");
        com5 = factory.getgongxia("x");

        com1.fasong();
        com2.fasong();
        com3.fasong();
        com4.fasong();
        com5.fasong();

    }
}
