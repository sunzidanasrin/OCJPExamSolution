package com.urmi.question102;

public class ClassCast {

    public static void main(String[] args) {
        Object[] myObjects = {
                new Integer(12),
                new String("foo"),
                new Integer(5),
                new Boolean(true)
        };

        //Arrays.sort(myObjects); // cause of ClassCastException

        for(int i = 0; i < myObjects.length; i++){
            System.out.println(myObjects[i].toString());
            System.out.println(" ");
        }
    }
}

