package com.company.gongchang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ImageReader ir;
        prictur pr;
        ir = new GifReader();
        pr = ir.creatimage();
        pr.duqu();
    }
}
