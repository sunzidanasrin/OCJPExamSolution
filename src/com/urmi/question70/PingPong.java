package com.urmi.question70;

public class PingPong implements Runnable {
    synchronized void hit(long n) {
    	//sychronized ekta type hisebe use krse
        for (int i = 1; i < 3; i++)
            System.out.print(n + "_" + i + " ");
        //_ deya hoise resul e sb gulay jeno _ ase
        //i er man 1 and 2
        //
    }

    public static void main(String[] args) {
        new Thread(new PingPong()).start();
        new Thread(new PingPong()).start();
    }

    @Override
    public void run() {
        hit(Thread.currentThread().getId());
    }
}
