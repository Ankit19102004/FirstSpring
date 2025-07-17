package com.example.FirstSpring.service;

import java.util.List;

import com.example.FirstSpring.Model.EmployeeDetails;



public interface EmployeeService {
void saveEmployee(EmployeeDetails employeeDetails);
	
	List<EmployeeDetails> getAllemployee();

void deleteEmployee(Integer id);
EmployeeDetails getEmployeeId(Integer id);




	

	
}
