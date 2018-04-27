package com.urmi.question36;

class Animal{
	public String noise() {
		return "pep";
	}
}

class Dog extends Animal{

	@Override
	public String noise() {
		return "bark";
	}
	
}

class Cat extends Animal{

	@Override
	public String noise() {
		return "meow";
	}
	
	
}

public class Application {

	public static void main(String[] args) {
		
		Animal animal = new Dog();
		Cat cat = (Cat)animal;
		//animal ta Dog er object. bt kaj korar somoy badha deynai. bt run time e giye dekhe eta cat er object na Dog er object.
		// tai runtime error dibe.
		System.out.println(cat.noise());
		
	}
}
