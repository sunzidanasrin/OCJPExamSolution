package com.urmi.question7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortOf {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(5);
		a.add(3);
		
		Collections.sort(a);
		//After sorting 1,2,3
		
		a.add(2);
		//After adding 2, Result 1,3,5,2
		
		Collections.reverse(a);
		//After reverse result 2,5,3,1
		
		System.out.println(a);
		//result 2,5,3,1
	}
	
}
