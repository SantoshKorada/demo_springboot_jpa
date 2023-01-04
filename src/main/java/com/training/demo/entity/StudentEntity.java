package com.training.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok Annotations
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

// JPA Annotations
@Entity
@Table(name = "student1", schema = "public")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rollNo")
	private Integer rollNo;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "phoneNumber")
	private Long phoneNumber;
	
	@Column(name = "status")
	private Boolean status;
	
}
