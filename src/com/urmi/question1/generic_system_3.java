package com.urmi.question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class generic_system_3 {

public static int sum(List<Integer> list) {
		
		int sum = 0;
		
		for ( Iterator<Integer>iter = list.iterator(); iter.hasNext(); ) {
			
			int i = ((Integer)iter.next()).intValue();
			
			sum += i;
		}
		
		return sum;
		}
//generic list k specify kre dey.
//amra list e string type int type sb dhukate pari. bt generic dile ota hoy string noy int hobe.
//jeta chabo sudhu otai nibe.

public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add(50);
	list.add(100);
	list.add(150);
	
	System.out.println("The sum is :" +sum(list));
	
}
}
