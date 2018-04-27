package com.urmi.question43;

public class Application {

	public void go(int x) {
		assert (x > 0);
		switch (x) {
		case 2:
			System.out.println("Urmi");
			default: assert true;

	
		}
	}
	
	public static void main(String[] args) {
		Application a = new Application();
		a.go(2);
	}
}
