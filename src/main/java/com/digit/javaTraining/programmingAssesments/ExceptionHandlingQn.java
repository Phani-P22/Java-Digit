package com.digit.javaTraining.programmingAssesments;

class InvalidUserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Invalid Credentials. Please check your Username and Password!";
	}
}

public class ExceptionHandlingQn {

}
