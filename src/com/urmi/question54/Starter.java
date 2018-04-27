package com.urmi.question54;

public class Starter extends Thread {

    private int x = 2;

    public static void main(String[] args) throws Exception {

        new Starter().makeItSo();
    }

    public Starter() {
        x = 5;
        start();
        //start method k call kora mne run k call kora
    }

    public void makeItSo() throws Exception {
        join();
        x = x - 1;
        System.out.println(x);
    }

    @Override
    public void run() {
        x *= 2;
    }
    //jokhn constructor call holo tokhn x er man 5
    //makeitso k call krse then run krle print krbe 9
    //run method er kaj prothom ei hoye jay

}

