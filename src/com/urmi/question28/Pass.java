package com.urmi.question28;

public class Pass {

	public static void main(String[] args) {
		int x = 5;

		Pass p = new Pass();

		p.doStuff(x);

		System.out.print(" main x = " + x);
	}

	void doStuff(int x) {

		System.out.print(" doStuff x = " + x++);
//x++ mne increment hbe. bt result e age x er man print krbe then 1 kre barbe.
		//bt ++x thakle age increment hbe then result dekhabe.
	}
}
