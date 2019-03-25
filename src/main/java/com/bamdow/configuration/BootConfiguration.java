package com.bamdow.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.bamdow.service.Student;
import com.bamdow.service.Teacher;

public class BootConfiguration {

	@Bean
	public Student student(){
		return new Student();
	}
	
	@Bean
	public Teacher teacher(){
		return new Teacher();
	}
}
