package com.digit.javaTraining.programmingAssesments;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float hours = sc.nextFloat();

		float seconds = hours * 60 * 60;
		
		System.out.println(seconds);
	}
}
