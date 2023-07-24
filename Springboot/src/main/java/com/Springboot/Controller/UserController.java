package com.Springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.bean.User;
import com.Springboot.service.UserService;

@RestController
public class UserController {
	     @Autowired
	    private UserService userService;
	     
	    @RequestMapping("/users")
	    public List<User>getAllusers(){
	    	return userService.getAllUsers();
	    }
	    
	    @RequestMapping(method=RequestMethod.POST,value="/users")
	    public void addUser(@RequestBody User user) {
	            userService.addUser(user);
	    }
	    
	    @RequestMapping(method=RequestMethod.PUT,value="/users/{id}")
	    public void updateUser(@PathVariable String id, @RequestBody User user) {
	            userService.updateUser(id,user);
	    }
	    @RequestMapping(method=RequestMethod.DELETE,value="/users/{id}")
	    public void deleteUser(@PathVariable String id) {
	            userService.deleteUser(id);
	    }
	    
	    
	    
}