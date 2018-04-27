
package com.urmi.question68;

public class Threads3 implements Runnable {
    @Override
    public void run() {
        System.out.print("running");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Threads3());
        t.run();
        t.run();
        t.start();
        //ekhane 3 bar runnig print krbe.
        //run k jotobar khusi print kora jbe bt start ekbr print korar pr pore abr dile exception asbe
    }
}

