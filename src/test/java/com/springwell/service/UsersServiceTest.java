package com.springwell.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsersServiceTest {

	private UsersService usersService;
	@BeforeEach
	void setUp() throws Exception {
		usersService	=	new UsersService();
	}

	@Test
	void testForAllUsers() {
		assertEquals(1,usersService.getAllUsers().size());
	}

}
