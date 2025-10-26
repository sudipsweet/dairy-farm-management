package com.dairy.farm.user.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 String resourceName;
	 String fieldName;
	 Long resourceId;
	 
	public ResourceNotFoundException(String resourceName, String fieldName, Long resourceId) {
		super(resourceName+" not found with "+fieldName+ " : "+resourceId);
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.resourceId = resourceId;
	}
}
