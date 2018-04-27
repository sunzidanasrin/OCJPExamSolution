package com.urmi.question17;

public class StringBuilderExample {

public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("123");
		
		String s1 = "123";
		
		sb1.append("abc");
		
		//append kora mne ager ja ase ta thakbe. 
		//bt pore jaa add krte chai ta agertar sthe add hoye jbe
		
		s1 = s1.concat("abc");
		
		//s1 = eta print er somoy 2 ta k call korar jnno
		//+ means jukto kora e concat 
		
		System.out.println(sb1 + " " + s1);
		
		//" " 2 tar mjhe space deyar jnno

	}

}
