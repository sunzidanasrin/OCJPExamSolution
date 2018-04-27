package com.urmi.question35;


class Foo{
	public int a = 3;
	public void addFive() {

		a += 5;
		System.out.println("f");
	}
}

class Bar extends Foo{
	public int a = 8;

	@Override
	public void addFive() {
		this.a += 5;
		System.out.println("b");
	}
	
	
	
}

public class Application {

	public static void main(String[] args) {
		
		Foo f = new Bar();
		//Bar er b ta print krte amdr Bar er object create krte hbe. bcz addFive Foo and Bar 2 tar e ase. t
		f.addFive();
		
	}
}
