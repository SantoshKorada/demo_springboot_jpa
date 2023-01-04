package com.training.demo.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.demo.dao.StudentDao;
import com.training.demo.entity.StudentEntity;
import com.training.demo.repository.StudentRepository;
import com.training.demo.request.StudentRequest;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	StudentRepository studentRepository;

	
	@Override
	public StudentEntity saveStudent(StudentRequest studentRequest) {
		// TODO Auto-generated method stub
		
		StudentEntity studentEntity=StudentEntity.builder()
				.name(studentRequest.getName())
				.age(studentRequest.getAge())
				.phoneNumber(studentRequest.getPhoneNumber())
				.status(studentRequest.getStatus())
				.build();
		
		// insert operation
		return studentRepository.save(studentEntity);
	}

}
