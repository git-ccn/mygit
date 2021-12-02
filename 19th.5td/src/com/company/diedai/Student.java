package com.company.diedai;/*
&学号         2019110502
&姓名           陈诺
&邮箱          2252390142@qq.com
&地址          宿州学院
&课程          java程序设计
*/

public class Student implements Comparable<Student> {
        private String name;
        private int age;

        public Student(String name,int age){
            super();
            this.name = name;
            this.age = age;
        }
        @Override
    public int compareTo(Student o) {
        if (this.age>o.age){
            return -1;
        }
        else if(this.age<o.age){
            return 1;
        }
        else{
            return 0;
        }
    }

        public String toString(){
            return "姓名"+ this.name+"年龄" + this.age;
        }



    }



