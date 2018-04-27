	package com.urmi.question55;

public class TestFive {

    private int x;
    //x er value 0. kono int type variable er mn na deya thakle default 0 pabe.

    public void foo() {

        int current = x;

        x = current + 1;
        //x = 0+1 = 1
        /* x = 1
         * x = 2
         * x = 3
         * x = 4
         * x = 5
         */
    }

    public void go() {

        for (int i = 0; i < 5; i++) {

            new Thread() {

                public void run() {

                    foo();

                    System.out.print(x + ", ");
                }

            }.start();
            
            //Thread thread = new Thread();
            //}
            //thread.start();
            //evabe likhar bodole //new Thread()//}.start()//evabe likhse
        }
        
        
    }

    public static void main(String[] args) {

        TestFive testFive = new TestFive();
        testFive.go();
    }
}

