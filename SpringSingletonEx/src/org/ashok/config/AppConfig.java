package org.ashok.config;

import org.ashok.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Employee emp()
	{
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Ashok");
		return emp;
	}
}
