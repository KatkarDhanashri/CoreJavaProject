package com.Springrest.SpringrestDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springrest.Springrest.Entity.Course;
public interface MyDao extends JpaRepository<Course,Long>{
		
}
