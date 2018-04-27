package com.urmi.question49;

public class Application {

    public static void main(String[] args) {

        try {

            A a = new A();

            a.method1();

        } catch (Exception e) {

            System.out.print("an error occurred");
        }
        //jdi c class e method 3 initialize b na thkto tobe eta B class e asto fire and B te na peye A te method 1 e fire asto. 

    }

}
