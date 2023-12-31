package com.Springrest.Springrest.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springrest.Springrest.Entity.Course;
import com.Springrest.Springrest.Service.MyService;

@RestController
public class myController {
     
	@Autowired
	private MyService myservice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course>getCourses(){
		return this.myservice.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.myservice.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path="/course")
	public Course addCourse(@RequestBody Course course) {
	return this.myservice.addCourse(course);
}
	@PutMapping("/courses")
	public Course UpdateCourse(@RequestBody Course course) {
		return this.myservice.UpdateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String courseId){
		try {
			this.myservice.DeleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	
	
	
	
	
	
	
}






