package com.example.FirstSpring.ServiceIMPL;

import java.util.List;

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


	@Override
	public List<StudentDetails> getAllstudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}


	@Override
	public StudentDetails getStudentId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
