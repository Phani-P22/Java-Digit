package com.digit.javaTraining.oops;

class Aniymal {
	void eat() {
		System.out.println("Animal Eats");
	}
	void breath() {
		System.out.println("Animal Breaths");
	}
	void sleep() {
		System.out.println("Animal Sleeps");
	}
}

class Monkey extends Aniymal{
	@Override
	void eat() {
		System.out.println("Monkey eats");
	}
	
	void jump() {
		System.out.println("Monkey jumps");
	}
}

class Dawg extends Aniymal {
	@Override
	void sleep() {
		System.out.println("Dog sleeps");
	}
	
	void bark() {
		System.out.println("Dog barks");
	}
}

class Lion extends Aniymal {
	@Override
	void breath() {
		System.out.println("Lion breaths");
	}
	
	void roar() {
		System.out.println("Lion roars");
	}
}

public class MethodTypesQn {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.breath();
		lion.roar();
		lion.eat();
		lion.sleep();
		
		System.out.println();
		
		Dawg dog = new Dawg();
		dog.bark();
		dog.breath();
		dog.eat();
		dog.sleep();
		
		System.out.println();
		
		Monkey monkey = new Monkey();
		monkey.jump();
		monkey.eat();
		monkey.sleep();
		monkey.breath();
	}
}
