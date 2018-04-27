package com.urmi.question109;

public class Boxer1 {
    Integer i = 4; // if i is empty then nullpointer exception is thrown
    int x;
    
    public Boxer1(int y){
        x = i+y;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        new Boxer1(new Integer(4));
    }
}
