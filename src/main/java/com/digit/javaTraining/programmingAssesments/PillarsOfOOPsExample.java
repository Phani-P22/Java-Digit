package com.digit.javaTraining.programmingAssesments;

import java.util.Scanner;

abstract class Shapes {
	float area;

	abstract void getData();

	abstract void calculate();

	void display() {
		System.out.println("Area: " + area);
	}
}

class Circle extends Shapes {
	private final float pi = 3.1415f;

	private float r;

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of Radius: ");
		r = sc.nextFloat();
	}

	@Override
	void calculate() {
		area = pi * r * r;
	}
}

class Square extends Shapes {
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of Side: ");
		side = sc.nextFloat();
	}

	@Override
	void calculate() {
		area = side * side;
	}
}

class Rectangle extends Shapes {
	private float l;
	private float b;

	public float getL() {
		return l;
	}

	public void setL(float l) {
		this.l = l;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length: ");
		l = sc.nextFloat();
		System.out.println("Enter the value of breadth: ");
		b = sc.nextFloat();
	}

	@Override
	void calculate() {
		area = l * b;
	}
}

class Geometry {
	static void usedShapes(Shapes s) {
		s.getData();
		s.calculate();
		s.display();
	}
}

public class PillarsOfOOPsExample {
	public static void main(String[] args) {
		Circle c = new Circle();
		Geometry.usedShapes(c);

		System.out.println("----");

		Square sq = new Square();
		Geometry.usedShapes(sq);

		System.out.println("----");

		Rectangle r = new Rectangle();
		Geometry.usedShapes(r);
	}
}
