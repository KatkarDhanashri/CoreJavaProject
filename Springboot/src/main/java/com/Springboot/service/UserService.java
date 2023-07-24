package com.Springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Springboot.bean.User;
import com.Springboot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    public UserRepository UserRepo;
	
	public List<User>getAllUsers(){
		List<User>users=new ArrayList<>();
		UserRepo.findAll().forEach(users::add);
		return users;
	}
	
	public void addUser(User user) {
		UserRepo.save(user);
	}

	public void updateUser(String id, User user) {
		UserRepo.save(user);	
	}

	public void deleteUser(String id) {
		UserRepo.deleteById(id);	
	}

}
