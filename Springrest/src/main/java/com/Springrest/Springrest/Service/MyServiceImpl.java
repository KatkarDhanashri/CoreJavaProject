package com.Springrest.Springrest.Service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springrest.Springrest.Entity.Course;
import com.Springrest.SpringrestDao.MyDao;
@Service
public class MyServiceImpl implements MyService {
	@Autowired
	private MyDao mydao;
	//List<Course>list;
	public MyServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(123,"Core-Java-Course","This course contains basics of java"));
//		list.add(new Course(145,"Spring-boot-Course","This course contains SpringBoot"));
	}
	@Override
	public List<Course> getCourses() {
		return mydao.findAll();
//		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		return mydao.getOne(courseId);
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
	}
	@Override
	public Course addCourse(Course course) {
		return mydao.save(course);
		//list.add(course);
//		return course;
	}
	@Override
	public Course UpdateCourse(Course course) {
		return mydao.save(course);
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDiscription(course.getDiscription());
//			}
//		});
//		return course;
	}
	@Override
	public void DeleteCourse(long parseLong) {
		Course entity=mydao.getOne(parseLong);
		mydao.delete(entity);
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}

}
