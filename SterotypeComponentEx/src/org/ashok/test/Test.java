package org.ashok.test;

import org.ashok.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("org.ashok");
		ac.refresh();
		Employee emp = ac.getBean("employee", Employee.class);
		System.out.println(emp);
	}

}
