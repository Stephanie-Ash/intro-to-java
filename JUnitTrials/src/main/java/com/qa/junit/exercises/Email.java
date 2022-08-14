package com.qa.junit.exercises;

public class Email {
	public boolean isValidEmail(String email) {
		int length = email.length();
		int findAt = email.indexOf("@");
		String subject;
		String domain;
		
		if(findAt > 0 && findAt < length - 1) {
			subject = email.substring(0, findAt);
			domain = email.substring(findAt + 1);
		} else {
			return false;
		}
		
		if(!Character.isLetterOrDigit(email.charAt(0))) {
			return false;
		} else if(!Character.isLetterOrDigit(email.charAt(length - 1))) {
			return false;
		} else if(!Character.isLetterOrDigit(subject.charAt(subject.length() - 1))) {
			return false;
		} else if(!domain.contains(".") || domain.charAt(0) == '.') {
			return false;
		} else if(domain.substring(domain.indexOf(".")).length() > 7) {
			return false;
		} else {
			return true;
		}
		
	}

}
