package com.mtech.mithun.mTestProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserNotFoundException extends Exception {
	
	private String messageDetails;

	public UserNotFoundException(String messageDetails) {
		super(messageDetails);
		this.messageDetails = messageDetails;
	}
	

}
