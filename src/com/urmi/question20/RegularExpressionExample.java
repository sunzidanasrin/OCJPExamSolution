package com.urmi.question20;

public class RegularExpressionExample {

public static void main(String[] args) {
		
		String test = "Test A. Test B. Test C.";
		
		String regex = "\\.\\s*";
		
		//separate hisabe point(.) ta bebohar hoyeche.
		//forward slash(\\) 2 tar mjhe point diye separate kora hoise
		//split er kaj korar jnno \\.\\s* likhte hoy 
		
		String[] result = test.split(regex);
		
		//ekoi rokm variable rakhte string array ta nite hoise.
		//split mne kata . eta ekta method.
		
		for(int i = 0; i<result.length; i++) {
			
			System.out.println(result[i]);
		}		
	}

}
