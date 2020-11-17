package com.springwell.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import com.springwell.model.Users;
import com.springwell.service.UsersService;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResource {

	private final UsersService usersService;

	@Autowired
	public UsersResource(UsersService usersService) {
		this.usersService = usersService;
	}

	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return usersService.getAllUsers();
	}

	@GetMapping("/usersByAge")
	public List<Users> getUsersByAge(@RequestParam(value = "age") int age) {
		return usersService.getUsersByAge(age);
	}

	@GetMapping("/users/firstName/{name}")
	public List<Users> getUsersByFirstName(@PathVariable(name = "name") String fName) {
		return usersService.getUsersByFirstName(fName);
	}

//	@GetMapping("/users/lastName/{name}")
//	public List<Users> getUsersByLastName(@PathVariable(name = "name") String lName) {
//		return usersService.getUsersByLastName(lName);
//	}

	@GetMapping(value="/users/lastName/{name}", produces=  org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	public List<Users> getUsersByLastName(@PathVariable(name = "name") String lName) {
		return usersService.getUsersByLastName(lName);
	}

}
