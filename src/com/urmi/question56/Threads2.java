package com.urmi.question56;

public class Threads2 implements Runnable {
	//thread niye kaj krte runnable k implement krte hbe.
	//runnable k implement krle run method override hoy

    @Override
    public void run() {

        System.out.println("run.");

        throw new RuntimeException("Problem");

    }

    public static void main(String[] args) {

        Thread t = new Thread(new Threads2());

        //thread er ekta object create kre constructor call krte jei class otr nm onusare.

        
        t.start();

        System.out.println("End of method.");
    }

}

