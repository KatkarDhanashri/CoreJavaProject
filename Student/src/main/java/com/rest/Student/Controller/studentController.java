package com.rest.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.Student.Bean.Student;
import com.rest.Student.Service.studentService;

@RestController
public class studentController {
	
	@Autowired
	private studentService studentservice;
	
	@RequestMapping("/students")
	public List<Student>getAllStudents(){
		return studentservice.getAllStudents();
	}
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public void addStudent(@RequestBody Student student) {
		studentservice.addStudent(student);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/student/id")
	public void updateStudent(@PathVariable int id, @RequestBody Student student) {
		studentservice.updateStudent(id, student);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentservice.deleteStudent(id);
	}
	    
}
