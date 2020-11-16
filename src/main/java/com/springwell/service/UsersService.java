package com.springwell.service;

import com.springwell.dao.UsersDao;
import com.springwell.model.Users;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersService {

	public List<Users> getAllUsers() {
		return UsersDao.getAllUsers();
	}

	public List<Users> getUsersByAge(int age) {
		List<Users> users = UsersDao.getAllUsers();
		return users.stream().filter(s -> s.getAge() > age).collect(Collectors.toList());
	}

	public List<Users> getUsersByFirstName(String fName) {
		List<Users> users = UsersDao.getAllUsers();
		return users.stream().filter(s -> s.getFirstName().equalsIgnoreCase(fName)).collect(Collectors.toList());
	}
}
