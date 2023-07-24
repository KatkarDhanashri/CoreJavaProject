package com.Springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.Springboot.bean.User;

public interface UserRepository extends CrudRepository<User,String>{

}
