package com.urmi.question47;

public class Application {

	static void test() throws Error {

        if (true) throw new AssertionError();
        //jodi error sotto hoy tahole try catch e exception handle kre error asbe. 
        //bt false kre dile test and end print krbe.
        //assertion e wrong asbena bt ami chai error asuk tokhn assertion use hoy. 
        //jemn ami ekta null pointer exeception chai tokhn assertion use krte hbe.

        System.out.println("test ");
    }

    public static void main(String[] args) {

        try {

            test();

        } catch (Exception ex) {

            System.out.println("exception ");
        }

        System.out.println("end ");
    }

}
