package com.dairy.farm.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDto {
	
	private long userId;
	
	@NotBlank(message = "UserName should not blank")
	private String userName;
	
	private String password;
	@Email(message = "Invalid email format")
	@NotBlank(message = "Email address should not blank")
	private String emailAddress;
	
	private String role; // ADMIN, STAFF, VET 

	public UserDto() {
		super();
	}

	public UserDto(long userId, String userName, String password, String emailAddress, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.emailAddress = emailAddress;
		this.role = role;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", password=" + password + ", emailAddress="
				+ emailAddress + ", role=" + role + "]";
	}
	
	

}
