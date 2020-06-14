package org.ashok.test;

import org.ashok.config.AppConfig;
import org.ashok.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp =(Employee)ac.getBean("emp");
		System.out.println(emp.toString());
		System.out.println(emp.hashCode());
		
		Employee emp1 =(Employee)ac.getBean("emp");
		System.out.println(emp1.toString());
		System.out.println(emp1.hashCode());
	}

}
