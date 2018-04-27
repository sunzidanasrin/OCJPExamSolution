package com.urmi.question65;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        String csv = "Sue,5,true,3";

        Scanner scanner = new Scanner(csv);

        scanner.useDelimiter(",");
        //delimitre er kaj , dhore dhore alada krbe.

        int age = scanner.nextInt();
        
        //runtime exception. string dhrci. bt nextInt type dekhte chaici

    }
}
