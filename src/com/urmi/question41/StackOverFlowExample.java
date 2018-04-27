package com.urmi.question41;

public class StackOverFlowExample {

	public static void m1() {
		int []x = {1,2,3,4,5};
		for(int y = 0; y < 6; y++)
			System.out.println(x[y]);
	}
	

		static int[] x = {7,6,5,4};
		static {
			x[1] = 8;
		    x[4] = 3; 
		}
	
	
	public static void main(String[] args) {
		m1();
		for(int y = 0;y<5; y++) {
			System.out.println();
		}
	}
}
