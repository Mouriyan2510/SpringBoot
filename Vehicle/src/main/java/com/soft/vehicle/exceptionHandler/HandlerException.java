package com.soft.vehicle.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.tags.HtmlEscapeTag;

import com.soft.vehicle.exceptionThrower.ModelNotAllowedException;
import com.soft.vehicle.exceptionThrower.ModelNotFoundException;

@RestControllerAdvice
public class HandlerException {
	
	@ExceptionHandler(ModelNotFoundException.class)
	public ResponseEntity<Object> yui(ModelNotFoundException nj){
		return new ResponseEntity<>(nj.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ModelNotAllowedException.class)
	public ResponseEntity<Object> yui(ModelNotAllowedException nj){
		return new ResponseEntity<>(nj.getMessage(),HttpStatus.NOT_FOUND);
	}

}
