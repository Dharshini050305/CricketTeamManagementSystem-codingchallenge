package com.hexaware.cricket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	@ExceptionHandler({PlayerNotFoundException.class })
	//@ResponseStatus(reason="Player Not Found",code = HttpStatus.NOT_FOUND)
	 public  ResponseEntity<String>  handleExp(Exception e) {
		 
		 return new ResponseEntity<String>("Player Not Found" , HttpStatus.NOT_ACCEPTABLE);


}
}
