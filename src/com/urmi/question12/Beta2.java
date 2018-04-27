package com.urmi.question12;

class Alpha2 {

    public void foo() {
        System.out.print("Afoo ");
    }
}

public class Beta2 extends Alpha2 {

    @Override
    public void foo() {
        System.out.print("Bfoo ");
    }

    public static void main(String[] args) {

        Alpha2 a = new Alpha2();
        
        //ekhane Alpha2 er object create kora hoyeche tai Alpha2 te Afoo
        // and Beta2 er Bfoo print krbe

        Beta2 b = new Beta2();

        a.foo();
        b.foo();
    }
}

