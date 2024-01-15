package com.rest.Student.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.Student.Bean.Student;
import com.rest.Student.repository.studentRepository;

@Service
public class studentService {
	@Autowired
	public studentRepository studentrepo;
	
	public List<Student>getAllStudents(){
		List<Student>students=new ArrayList<>();
		studentrepo.findAll().forEach(students::add);
		return students;
	}
	
	public void addStudent(Student student) {
		studentrepo.save(student);
	}
	
	public void updateStudent(int id,Student student) {
		studentrepo.save(student);
	}
	
	public void deleteStudent(int id) {
		studentrepo.deleteById(id);
	}

}
