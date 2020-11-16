package com.springwell.dao;

import java.util.Arrays;
import java.util.List;

import com.springwell.model.Users;

public class UsersDao {

	public static List<Users> getAllUsers() {
		Users users = new Users();
		users.setId(1L);
		users.setFirstName("Adarshpal");
		users.setLastName("Brar");
		users.setEmail("adarshpal.brar@gmail.com");
		users.setAge(39);

		Users users2 = new Users();
		users2.setId(2L);
		users2.setFirstName("RS");
		users2.setLastName("S");
		users2.setEmail("rs@hotmail.com");
		users2.setAge(44);
		List<Users> usersList = Arrays.asList(users, users2);
		return usersList;
	}

}
