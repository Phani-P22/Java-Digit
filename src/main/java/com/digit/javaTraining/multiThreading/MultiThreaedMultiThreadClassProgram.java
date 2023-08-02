package com.digit.javaTraining.multiThreading;

import java.util.Scanner;

class Banking extends Thread {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter acc no: ");
		int accNo = sc.nextInt();
		System.out.println("Enter pin: ");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
	}
}

class Printing extends Thread {
	public void run() {
		System.out.println("Printing Operation");
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Hi Gud Mrng");
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing completed");
	}
}

class Add extends Thread {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Additiopn Operation");
		System.out.println("Enter num1: ");
		int a = sc.nextInt();
		System.out.println("Enter num2: ");
		int b = sc.nextInt();
		int res = a + b;
		System.out.println("Result is : " + res);
		System.out.println("Addition Done");
	}
}

public class MultiThreaedMultiThreadClassProgram {
	public static void main(String[] args) {
		System.out.println("Main started");

		Banking op1 = new Banking();
		op1.setName("Banking");
		op1.setPriority(3);

		Printing op2 = new Printing();
		op2.setName("Printing");
		op2.setPriority(8);

		Add op3 = new Add();
		op3.setName("add");

		op1.start();
		op2.start();
		op3.start();
		System.out.println("Main terminated");
	}
}
