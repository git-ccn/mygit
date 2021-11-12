package com.company.zhize;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shangji mitor,platoonleader,battalionC,huiyi;
        mitor = new monitor("班长");
        platoonleader = new PlatoonLeader("排长");
        battalionC = new BattalionC("营长");
        huiyi =new Huiyi("所有上级");

        mitor.setSuccessor(platoonleader);
        platoonleader.setSuccessor(battalionC);
        battalionC.setSuccessor(huiyi);

        diren d1 = new diren(8,"small");
        mitor.processRequest(d1);
        diren d2 = new diren(100,"middle");
        mitor.processRequest(d2);
        diren d3 = new diren(300,"big");
        mitor.processRequest(d3);
    }
}
