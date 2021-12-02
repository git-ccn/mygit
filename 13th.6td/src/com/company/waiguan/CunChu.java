package com.company.waiguan;

public class CunChu {
    vidoRegulat vr = new vidoRegulat();
    photoRegulat pr = new photoRegulat();
    NewRegulat nr = new NewRegulat();

    public void beifen() {
        System.out.println("一键备份");
        vr.vido();
        pr.photo();
        nr.New();
    }
}
