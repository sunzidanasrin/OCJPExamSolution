package com.urmi.question105;

public class Application {
    public static void main(String[] args) {
        try{
            args = null;
            args[0] = "test";
            System.out.println(args[0]);
        }catch (Exception ex){
            System.out.println("Exception");
        }
        /*
        catch (NullPointerException npe){
            System.out.println("NullPointerException");
        }
        */
    }
}

