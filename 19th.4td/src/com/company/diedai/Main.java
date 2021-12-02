package com.company.diedai;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Object> problem = new ArrayList<Object>();

        problem.add("cctv1");
        problem.add("cctv2");
        problem.add("cctv3");
        problem.add("cctv4");
        problem.add("cctv5");

        MyTV list = new MyTV(problem);
        Iterator yao = list.createNewTV();

        while(!yao.hasNext()){
            System.out.println(yao.currentItem());
            yao.next();
        }
    }
}
