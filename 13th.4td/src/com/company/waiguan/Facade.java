package com.company.waiguan;

public class Facade extends absFacade {
   private Show show = new Show();
   private shuju sj = new shuju();

    @Override
    public void xitong() {
        sj.Read();
        sj.zhuanhuan();
        sj.fenxi();
        show.baobiao();
    }
}
