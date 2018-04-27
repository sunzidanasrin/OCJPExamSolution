package com.urmi.question12;

class Alpha {

    public void foo() {
        System.out.print("Afoo ");
    }
}

public class Beta extends Alpha {

    @Override
    public void foo() {
        System.out.print("Bfoo ");
    }

    public static void main(String[] args) {

        Alpha a = new Beta();
        //a hocche Beta r object

        Beta b = (Beta) a;

        a.foo();
        //a Betar object tai Beta te Bfoo deya otai print krbe
        b.foo();
    }
}

