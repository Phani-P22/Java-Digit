package com.digit.javaTraining.strings;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		
		sb.append("Programming");
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		sb.delete(0, 4);
		
		System.out.println(sb);
		
		System.out.println(sb.getClass());
		
		sb.reverse();
		
		System.out.println(sb);

	}
}
