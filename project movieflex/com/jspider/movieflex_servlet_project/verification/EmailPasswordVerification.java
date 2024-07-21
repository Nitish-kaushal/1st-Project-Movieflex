package com.jspider.movieflex_servlet_project.verification;

import java.util.regex.Pattern;

/**
 * 
 *@author NITISH KAUSHAL
 *
 */
public class EmailPasswordVerification {

	public static String emailVerification(String emailVerification) {
		boolean character=Pattern.compile("[a-z]").matcher(emailVerification).find();
		boolean number = Pattern.compile("[0-9]").matcher(emailVerification).find();
		boolean special = Pattern.compile("[@.]").matcher(emailVerification).find();
		return (character&&number&&special)?emailVerification:null;
	}
	
	
	public static String passwordVerification(String password) {
		boolean character=Pattern.compile("[a-zA-Z]").matcher(password).find();
		boolean number = Pattern.compile("[0-9]").matcher(password).find();
		boolean special = Pattern.compile("[@$%&*]").matcher(password).find();
		return (character&&number&&special)?password:null;
	}
}
