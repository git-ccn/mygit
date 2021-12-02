package com.company.diedai;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student("Bob",23);
        Student s2 = new Student("Tom",20);
        Student s3 = new Student("James",19);
        Student s4 = new Student("Simith",22);

        List<Student> list = new ArrayList<Student>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Collections.sort(list);

        for(Student stu: list){
            System.out.println(stu.toString());
        }


    }
}
