package com.urmi.question69;

public class Threads5 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
        	//runnable er object toiri krci
        	//ager ektay ei runnable k amra implement krcilam bt objct create krci oi class er
        	// bt oi class mainli runnable k pay
            @Override
            public void run() {
                System.out.println("bar");
            }
        }).start();
    }
}
