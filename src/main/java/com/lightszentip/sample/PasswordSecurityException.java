package com.lightszentip.sample;

public class PasswordSecurityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public PasswordSecurityException(Throwable exception) {
		super(exception);
	}

}
