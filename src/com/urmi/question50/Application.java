package com.urmi.question50;

public class Application {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (i > 6)
                break;
            //condition e bola hoise 6 er boro hole mane 7 e gelei break hoye jbe.
            

            System.out.println(i);
        }

        //System.out.println(i); // compilation fails
        //bcz sout baire dey condition er tai result compile fail. 
        // bcz i er man condition er vetor deya ache. tai print o condition er vetor hbe.

    }

}
