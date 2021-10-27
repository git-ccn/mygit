package com.company.xiangyuan;

import java.util.Hashtable;

public class xiangyFactory {
    private xiangyFactory xyf = new xiangyFactory();
    private Hashtable ht;

    public xiangyFactory() {
        ht = new Hashtable();
        gongxia jxq, jhj;
        jhj = new gongxia();
        ht.put("h", jhj);
        jxq = new jixianqi();
        ht.put("x", jxq);
    }

    public class xiangyFactory getXyf() {
        return xyf;
    }

    public class gongxia getgongxia(String gx) {
        return (gongxia) ht.get(gx);
    }
}
