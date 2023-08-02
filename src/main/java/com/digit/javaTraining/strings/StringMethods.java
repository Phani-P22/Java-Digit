package com.digit.javaTraining.strings;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "JavaProgramming";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("Jav"));
		System.out.println(s1.contains("Rava"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf(5));
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.startsWith("Ba"));
		System.out.println(s1.endsWith("ng"));
		System.out.println(s1.endsWith("rg"));
		
		String s2 = "";
		String s3 = "  ";
		System.out.println(s2.isEmpty());
		System.out.println(s2.isBlank());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 9));
	}
}
