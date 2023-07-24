package com.Springrest.Springrest.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Springrest.Springrest.Entity.Course;
@Service
public interface MyService {

	public List<Course>getCourses();

	public Course getCourse(long parseLong);
	
	public Course addCourse(Course course);

	public Course UpdateCourse(Course course);

	public void DeleteCourse(long parseLong);
}
