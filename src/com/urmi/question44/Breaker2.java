package com.urmi.question44;

import java.util.Iterator;

public class Breaker2 {

    static String o = "";
    
    //static loading time class load hbr time . class load hbr sthe sthe eta load hoy.

    public static void main(String[] args) {

        z:
        	
        for (int x = 2; x < 7; x++) {

            if (x == 3)
                continue;//continue 2,4 and3 o print krbena bcz 3 e continue te ese skip kre baki porer guli print krbe. 
            if (x == 5)
                break z;//5 print krbena bcz 5 e break hoye gese
//uporer z break kre dise
            
            o = o + x;
            
            //o tar sthe x er concatanation
        }

        System.out.println(o);

    }
}
