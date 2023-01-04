package com.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.request.StudentRequest;
import com.training.demo.response.StudentResponse;
import com.training.demo.service.StudentActions;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("student")
@Slf4j
public class StudentController {
	
	@Autowired
	StudentActions studentActions;

	@GetMapping("test")
	public String testStudentController() {
		log.info("This is Student Controller :: testStudentController ");
		return "Student-Controller is working";
	}
	
	@PostMapping("create")
	public  ResponseEntity<StudentResponse>  createStudent(@RequestBody StudentRequest studentRequest) {
		log.info("*** create student method ***");
		log.info("StudentRequest :: {}",studentRequest.toString());
		StudentResponse studentResponse=studentActions.createStudent(studentRequest);
		log.info("Student Response :: {} ",studentResponse);
		return new ResponseEntity<>(studentResponse,HttpStatus.CREATED);
		
	}

}
