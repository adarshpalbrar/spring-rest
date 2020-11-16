package com.springwell.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest {

	private UsersService usersService;

	@BeforeEach
	public void beforeAll() {
		usersService = new UsersService();
	}

	@Test
	@DisplayName("Test1")
	public void testUsers_Total_2_Expect_20_Error() {
		assertEquals(20, usersService.getAllUsers().size());
	}

	@Test
	@DisplayName("Test2")
	public void testUsers_Total_2_Expect_2_Correct() {
		assertEquals(2, usersService.getAllUsers().size());
	}
	@Test
	@DisplayName("Test3")
	public void testUsersByAge_Input_40_Output_1() {
		assertEquals(1, usersService.getUsersByAge(40).size());
	}
}
