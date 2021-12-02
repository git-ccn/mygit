package com.company.diedai;

import java.util.ArrayList;
import java.util.List;

public abstract class NewTV {
    protected List<Object> object = new ArrayList<Object>();

    public NewTV(List<Object> object){
        this.object = object;
        }

    public void addObject(Object obj){
        this.object.add(obj);
    }
    public List<Object> getObjects(){
        return this.object;
    }
    public abstract Iterator createNewTV();
}
