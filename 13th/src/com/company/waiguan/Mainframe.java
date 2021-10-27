package com.company.waiguan;

public class Mainframe {
    private Memoy memoy = new Memoy();
    private CPU cpu = new CPU();
    private HardDisk hardDisk = new HardDisk();
    private OS os = new OS();

    public void on() {
        memoy.check();
        cpu.run();
        hardDisk.read();
        os.load();
    }
}
