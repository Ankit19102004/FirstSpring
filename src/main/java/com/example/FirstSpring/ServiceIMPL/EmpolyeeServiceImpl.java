package com.example.FirstSpring.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstSpring.Model.EmployeeDetails;

import com.example.FirstSpring.Repository.EmployeeRepository;
import com.example.FirstSpring.service.EmployeeService;

@Service

public class EmpolyeeServiceImpl implements EmployeeService {
	@Autowired

	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(EmployeeDetails employeeDetails) {
		// TODO Auto-generated method stub
		employeeRepository.save(employeeDetails);

	}

	@Override
	public List<EmployeeDetails> getAllemployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	
	}
	

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		
	}

	@Override
	public EmployeeDetails getEmployeeId(Integer id) {
		return employeeRepository.findById(id).get();
		
	}


	}