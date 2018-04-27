package com.urmi.question2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Urmi");
		list.add("Megha");
		list.add("Asir");
		
		for(String name : list) {
			System.out.println(name);
		}
		
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}
}

