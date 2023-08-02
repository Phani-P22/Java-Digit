package com.digit.javaTraining.multiThreading;

import java.util.Scanner;

public class SingleThreadProgram {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Banking Operation");
		System.out.println("Enter accno: ");
		int accno = sc.nextInt();
		System.out.println("Enter pin");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
		
		System.out.println("Printing Operations: ");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Good Morning");
			Thread.sleep(3000);
		}
		System.out.println("Printing Completed");
		
		System.out.println("Addition Operation");
		System.out.println("Enter number 1: ");
		int a = sc.nextInt();
		System.out.println("Enter number 2: ");
		int b = sc.nextInt();
		int res = a + b;
		System.out.println("The Result is : " + res);
		System.out.println("Addition Completed");
	}
}
