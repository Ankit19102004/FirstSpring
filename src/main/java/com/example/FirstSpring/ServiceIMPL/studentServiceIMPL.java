package com.example.FirstSpring.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstSpring.Model.StudentDetails;
import com.example.FirstSpring.service.StudentService;
import com.example.FirstSpring.Repository.StudentRepository;
@Service
public class studentServiceIMPL implements StudentService {
	@Autowired
	
	StudentRepository studentRepository;
	

	@Override
	public void saveStudent(StudentDetails studentDetails) {
		// TODO Auto-generated method stub
		studentRepository.save(studentDetails);
		
	}

}
