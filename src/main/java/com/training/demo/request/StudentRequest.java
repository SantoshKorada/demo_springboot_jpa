package com.training.demo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentRequest {

	private String name;
	private Integer age;
	private Long phoneNumber;
	private Boolean status;
	
}
