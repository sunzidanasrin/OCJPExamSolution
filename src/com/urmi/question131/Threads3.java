package com.urmi.question131;

public class Threads3 implements Runnable{

    @Override
    public void run() {
        System.out.print("running");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Threads3());
        t.run();
        t.run();
        t.start();
    }
}
