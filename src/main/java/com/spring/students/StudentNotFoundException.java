package com.spring.students;

public class StudentNotFoundException extends RuntimeException {
	
	public StudentNotFoundException()
	{
		System.out.println("Student is not found: Exception occured");
	}

	public StudentNotFoundException(String message) {
		super(message);		
	}
		
}
