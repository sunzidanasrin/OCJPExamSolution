package com.urmi.question14;

public class StaticArray {
	
	static final int[] a = {100, 200};
	
	static final int[] b;
	
static {
		
		b = new int[2];
		b[0] = 100;
		b[1] = 200;
	}
	
	public static void main(String[] args) {

		System.out.println(a[0]);
		System.out.println(b[1]);

	}


	

}
