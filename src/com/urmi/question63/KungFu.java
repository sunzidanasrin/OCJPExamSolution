package com.urmi.question63;

public class KungFu {

    public static void main(String[] args) {

        Integer x = 400;

        Integer y = x;
        //y = 400
        x++;
        //x = 401

        StringBuilder sb1 = new StringBuilder("123");
        //stringbuilder string make kre

        StringBuilder sb2 = sb1;

        sb1.append("5");
        //oi string builder er sthe kisu add krte ei append method

        System.out.println((x == y) + " " + (sb1 == sb2));
        //y er mn 400 and x er mn 401 mane result first ongse false
        // sb1 er mn string mne 123 and sb2 o same mn. ekhane sb1 123 and pore append hoye 5 add hoye jay 
        //and sb1 er mn sb2 er ek e hoy

    }

}

