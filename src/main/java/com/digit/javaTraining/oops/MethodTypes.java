package com.digit.javaTraining.oops;

class Plane {
	void takeOff() {
		System.out.println("Plane Took-Off");
	}
	
	void fly() {
		System.out.println("Plane flying");
	}
	
	void land() {
		System.out.println("Plane landed");
	}
}

class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane flying low");
	}
	
	void carryGoods() {
		System.out.println("Cargo carries goods");
	}
}

public class MethodTypes {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
	}
}
