package com.example.FirstSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FirstSpring.Model.EmployeeDetails;
import com.example.FirstSpring.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/save")
	
	public String saveEmployee(@RequestBody EmployeeDetails employeeDetails) {
		employeeService.saveEmployee(employeeDetails);
		return"Data save Sucessfully";
		
		
	}
	@GetMapping("/getall")
	public List<EmployeeDetails> getAllemployee() {
		return employeeService.getAllemployee();
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
		return"Data delete sucessfully";
		
	}
	@GetMapping("/get/{id}")
	public EmployeeDetails getEmployee(@PathVariable("id") Integer id) {
		return employeeService.getEmployeeId(id);
	}
	

	
}
