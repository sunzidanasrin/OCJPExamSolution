package com.urmi.question107;

public class Test {
    public enum Dogs{collie, harrier};
    public static void main(String[] args) {
           Dogs myDog = Dogs.collie;
        switch(myDog){
            case collie:
                System.out.print("collie ");
            case harrier:
                System.out.print("harrier");
        }
    }
}