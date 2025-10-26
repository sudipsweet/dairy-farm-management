package com.dairy.farm.user.dto;

public class ApiResponse {

	private String errorMsg;
	private Boolean isSuccess;

	public ApiResponse() {
	}

	public ApiResponse(String errorMsg, Boolean isSuccess) {
		super();
		this.errorMsg = errorMsg;
		this.isSuccess = isSuccess;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	@Override
	public String toString() {
		return "ApiResponse [errorMsg=" + errorMsg + ", isSuccess=" + isSuccess + "]";
	}

}