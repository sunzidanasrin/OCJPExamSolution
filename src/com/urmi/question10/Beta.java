package com.urmi.question10;

interface Foo {

    int bar();
}

public class Beta {

    class A implements Foo {

        @Override
        public int bar() {

            return 1;
        }

    }

    public int fubar(Foo foo) {

        return foo.bar();
    }

    public void testFoo() {

        class A implements Foo {

            @Override
            public int bar() {

                return 2;
            }

        }

        System.out.println(fubar(new A()));
    }

    public static void main(String[] args) {

        new Beta().testFoo();

    }

}

