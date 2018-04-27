package com.urmi.question108;

public class A {
	   public void method1(){
	       try {
	           B b = new B();
	           b.method2();
	           
	       } catch (TestException te) {
	           throw  new RuntimeException(te);
	       }
	   }
	}