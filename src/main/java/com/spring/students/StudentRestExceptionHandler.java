package com.spring.students;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc)
	{
		//create a StudentErrorResponse
		StudentErrorResponse error=new StudentErrorResponse();
		//error.setStatus(404); instead of direct status code use http status codes
		error.setStatus(HttpStatus.NOT_FOUND.value());		
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		//return Response
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}

}
