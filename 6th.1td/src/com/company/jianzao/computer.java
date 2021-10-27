package com.company.jianzao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-15
 */

public class computer {
    private String type;
    private String cpu;
    private String memory;
    private String hd;
    private String mainframe;
    private String display;

    public void setType(String type){
        this.type=type;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHD(String hd) {
        this.hd = hd;
    }

    public void setMainframe(String mainframe) {
        this.mainframe = mainframe;
    }

    public void setDisplay(String display) {
        this.display = display;
    }


    public String getType(){
        return (this.type);
    }
    public String getCpu(){
        return (this.cpu);
    }
    public String getMemory(){
        return (this.memory);
    }
    public String getHd(){
        return (this.hd);
    }
    public String getMainframe(){
        return (this.mainframe);
    }
    public String getDisplay(){
        return (this.display);
    }


}

