package com.banking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<?> idNotFound(Exception ex){
		Response response=new Response(ex.getMessage(),HttpStatus.BAD_REQUEST.toString(),getClass().toString());
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NewException.class)
	public ResponseEntity<?> newException(Exception ex){
		Response response=new Response(ex.getMessage(),HttpStatus.BAD_REQUEST.toString(),getClass().toString());
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> runTimeException(Exception ex){
		Response response=new Response(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR.toString(),getClass().toString());
		return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
