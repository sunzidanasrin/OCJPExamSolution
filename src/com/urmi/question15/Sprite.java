package com.urmi.question15;

interface Foo{
	int bar();
}

public class Sprite {

	public int fubar(Foo foo) {

		return foo.bar();
	}

	public void testFoo() {

		fubar(new Foo() {

			@Override
			public int bar() {

				return 1;
			}
		});
	}
//main method chara run krbena
	//mul kotha interface tar object create er jnno override krte hbe.
	  //foo er object create er jnno eto kisu
}
