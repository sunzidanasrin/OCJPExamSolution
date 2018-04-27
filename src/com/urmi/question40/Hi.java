package com.urmi.question40;

public class Hi {
	
	void m1() { }
	public void m2() {}
	
	 private void m3() { }
	 protected void m4() {}

}

class Lois extends Hi{
	
	//void m1() {}
	//protected void m1() {}
	//public void m1() {}
	// private void m1(){} //error
	
	//void m2() {}//error
	//protected void m2() {} //error
	//public void m2() {}
	// private void m2(){} //error
	
	//void m3() {}//error
	//public void m3() {}//error
	// private void m3(){} //error
	//protected void m3() {} //error
	
	//m3 purotai private tai dhorte parena.
	
	//void m4() {}//error
	//public void m4() {}
	// private void m4(){} //error
	//protected void m4() {} 
	
	//mul kotha same package e inherit krle sudhu private chara sb dhora jay
	//bt bairer package theke default r public k dhora jay inherit kre.
}
