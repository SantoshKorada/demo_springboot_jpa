package com.training.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.dao.StudentDao;
import com.training.demo.entity.StudentEntity;
import com.training.demo.request.StudentRequest;
import com.training.demo.response.StudentResponse;
import com.training.demo.service.StudentActions;

@Service
public class StudentActionsImpl implements StudentActions {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public StudentResponse createStudent(StudentRequest studentRequest) {
		// TODO Auto-generated method stub
		
		StudentEntity studentEntity=studentDao.saveStudent(studentRequest);
		StudentResponse studentResponse= StudentResponse.builder()
				.rollNo(studentEntity.getRollNo())
				.name(studentEntity.getName())
				.age(studentEntity.getAge())
				.phoneNumber(studentEntity.getPhoneNumber())
				.status(studentEntity.getStatus())
				.build();
		return studentResponse;
		
	}

	

}
