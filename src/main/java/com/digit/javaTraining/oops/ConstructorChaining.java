package com.digit.javaTraining.oops;

class Animal {
	String name;
	
	Animal() {
		System.out.println("animal empty const");
	}
	
	Animal(String s) {
		this();
		System.out.println("animal 1 param const");
		this.name = s;
	}
}

class Dag extends Animal {
	String breed;
	
	Dag () {
		super("Aaa");
		this.breed = "Bbb";
	}
	
	Dag (String  s) {
		this.breed = s;
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		
	}
}
