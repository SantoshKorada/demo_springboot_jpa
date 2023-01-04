package com.training.demo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentResponse {

	
	private Integer rollNo;
	private String name;
	private Integer age;
	private Long phoneNumber;
	private Boolean status;
	
}
