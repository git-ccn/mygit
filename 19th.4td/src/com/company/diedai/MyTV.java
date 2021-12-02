package com.company.diedai;/*
&学号         2019110502
&姓名           陈诺
&邮箱          2252390142@qq.com
&地址          宿州学院
&课程          java程序设计
*/

import java.util.List;

public class MyTV extends NewTV{
        public MyTV(List<Object> problem){
            super(problem);
        }

        @Override
        public Iterator createNewTV() {
            return new yaokong();
        }

        private class yaokong implements Iterator{
            private int curror;
            public yaokong(){
                curror = 0;
            }

            @Override
            public void first() {
                curror = 0;
            }

            @Override
            public void next() {
                if(curror<object.size()){
                    curror++;
                }
            }

            @Override
            public boolean hasNext() {
                return curror == object.size();
            }

            @Override
            public Object currentItem() {
                return object.get(curror);
            }

        }
    }

