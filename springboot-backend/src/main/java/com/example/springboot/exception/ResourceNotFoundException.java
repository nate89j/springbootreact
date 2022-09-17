package com.example.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	/**
	 We create a class to pass the exception message to java
	 We use this custom exception whenever there is no entry in db to be found, the api will return a not found
	 to the client
	 */
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		
		super(message);
	}

}
