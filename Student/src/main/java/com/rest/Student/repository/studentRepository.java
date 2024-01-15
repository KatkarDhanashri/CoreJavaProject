package com.rest.Student.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.Student.Bean.Student;

public interface studentRepository extends CrudRepository<Student, Integer> {

}
