package com.dairy.farm.user.exception;

public class DuplicateUserException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateUserException(String fieldName, String value) {
		super(fieldName + " '" + value + "' already exists.");

    }
}

