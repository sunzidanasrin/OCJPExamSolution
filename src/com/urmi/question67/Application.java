package com.urmi.question67;

import com.urmi.question80.MainClass;

public class Application {

	void go() throws Exception{
		Thread t = new Thread(new Triangle());
		t.start();
		
		
		for(int x = 1; x < 100000; x++) {
			if(x%100 == 0) System.out.print("g");
		}
	
	}
	public static void main(String[] args) throws Exception {
		Application app = new Application();
		app.go();
		// proti 100 pojnto ghurle 1 bar print krbe . 
		//total 1000 bar print krbe
		
		//etar ans yield() method and sleep method bt bojha jayni.
	}
}
