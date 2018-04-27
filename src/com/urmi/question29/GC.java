package com.urmi.question29;

public class GC {

private Object o;
	
	private void doSomethingElse(Object obj) {
		
		o = obj;
	}
	
	public void doSomething() {
		
		Object o = new Object();
		
		doSomethingElse(o);
		
		o = new Object();
		
		doSomethingElse(null);
		//doSomethingElse method ta null pathano hoise parametre hisabe.
		//bcz object ta default value null. ja oi method e pathanor somoy null bole deya hoise
		//null bolay eta gerbaze collection e chole jbe.
		
		o = null;
	}

}
