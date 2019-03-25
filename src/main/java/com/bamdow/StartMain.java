package com.bamdow;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bamdow.configuration.BootConfiguration;
import com.bamdow.service.Student;

public class StartMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext();
		context.register(BootConfiguration.class);
		//开启包扫描
		context.scan("com.bamdow");
		context.refresh();
		Student stu = context.getBean(Student.class);
		stu.setAge(12);
		stu.setName("bamdow");
		System.out.println(stu);
	}
}
