package com.digit.javaTraining.programmingAssesments;

import java.util.Scanner;

public class RemoveWhitespaces {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string");
	    String str = sc.nextLine();
	    
	    int i, j;
	    
	    String newStr = "";
	    
	    for(i = 0; i < str.length(); i++) {
	        if(str.charAt(i) != ' ') {
	        	break;
	        }
	    }
	    
	    for (j = str.length() - 1; j >= 0; j--) {
	        if(str.charAt(j) != ' ') {
	        	j++;
	        	break;
	        }
	    }
	    
	    for (int k = i; k < j; k++) {
	    	newStr += str.charAt(k);
	    }
	    
	    System.out.println(newStr);
	}
}