package com.healthcoach.profile.domain;


public class LoginResponse {

	private String message;
	
	public LoginResponse() {
		// TODO Auto-generated constructor stub
	}
	public LoginResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
