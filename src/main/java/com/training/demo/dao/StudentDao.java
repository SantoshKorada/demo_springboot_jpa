package com.training.demo.dao;

import com.training.demo.entity.StudentEntity;
import com.training.demo.request.StudentRequest;

public interface StudentDao {

	public StudentEntity saveStudent(StudentRequest studentRequest);
}
