package com.training.demo.service;

import com.training.demo.request.StudentRequest;
import com.training.demo.response.StudentResponse;

public interface StudentActions {

	public StudentResponse createStudent(StudentRequest studentRequest);

	
}
