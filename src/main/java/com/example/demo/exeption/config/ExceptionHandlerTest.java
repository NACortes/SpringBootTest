package com.example.demo.exeption.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerTest extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler({Exception.class})
	public ResponseEntity<Object> handleSomeCustomException(Exception ex, WebRequest request){
		return new ResponseEntity<>("Some Exception Ocurred", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
