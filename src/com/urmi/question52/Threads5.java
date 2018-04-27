package com.urmi.question52;

public class Threads5 {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {

                System.out.println("bar");
            }
        });

        thread.start();

    }
//thread er khetre runnable interface k implement krte hobe. and run method k override krte hbe.
    //thread er ekta object create kre constructor call krte jei class otr nm onusare.
    //sudhu runnable k implement krle hbe.
    //bt thread k extend krle object.start() method likhe print krte hbe
}
