package com.digit.javaTraining.oops;

public class ConstructorExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.getData();
	}
}

class Dog {
	private String name;

	Dog () {
		name = "R";
	}
	
	void getData() {
		System.out.println(name);
	}
}