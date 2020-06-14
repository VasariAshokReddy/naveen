package org.ashok.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("1")
	private int empId;
	@Value("Naveen")
	private String empName;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
