package com.digit.javaTraining.multiThreading;

import java.util.Scanner;

class Operations extends Thread {

	public void run() {
		if (Thread.currentThread().getName().equalsIgnoreCase("banking")) {
			banking();
		} else if (Thread.currentThread().getName().equalsIgnoreCase("printing")) {
			printing();
		} else {
			add();
		}
	}

	void banking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter acc no: ");
		int accNo = sc.nextInt();
		System.out.println("Enter pin: ");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
	}

	void add() {
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

	void printing() {
		System.out.println("Printing Operation");
		for (int i = 1; i <=5; i++) {
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

public class MultiThreadProgram {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Operations op1 = new Operations();
		op1.setName("banking");
		op1.setPriority(3);
		
		Operations op2 = new Operations();
		op2.setName("printing");
		op2.setPriority(8);
		
		Operations op3 = new Operations();
		op3.setName("add");
		
		op1.start();
		op2.start();
		op3.start();
		System.out.println("Main terminated");
	}
}
