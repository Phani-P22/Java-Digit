package com.digit.javaTraining.exceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Your age is less than 18. You are a Kid";
	}
}

class OverAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Your age is more than 60. Stop applying.";
	}
}

class Candidate {
	int age;

	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
	}

	void verify() throws Exception {
		if (age < 18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		} else if (age > 60) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		} else {
			System.out.println("You are good to go. Go get License.");
		}
	}
}

class RTO {
	void grantLicense(Candidate c) {
		try {
			c.getData();
			c.verify();
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}
}

public class CustomExceptions {
	public static void main(String[] args) {
		Candidate c = new Candidate();
		RTO r = new RTO();
		r.grantLicense(c);
	}
}
