package com.digit.javaTraining.multiThreading;

import java.util.Scanner;

class BankingB implements Runnable {
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

class PrintingP implements Runnable {
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

class AddA implements Runnable {
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

public class ThreadUsingRunnable {
	public static void main(String[] args) {
		System.out.println("Main started");

		BankingB op1 = new BankingB();
		PrintingP op2 = new PrintingP();
		AddA op3 = new AddA();

		Thread t1 = new Thread(op1);
		Thread t2 = new Thread(op2);
		Thread t3 = new Thread(op3);

		t1.start();
		t2.start();
		t3.start();

		System.out.println("Main terminated");
	}
}
