package com.springwell.service;

import com.springwell.model.Users;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {

    public List<Users> getAllUsers() {
        Users users = new Users();
        users.setId(1L);
        users.setFirstName("Adarshpal");
        users.setLastName("Brar");
        users.setEmail("adarshpal.brar@gmail.com");
        users.setJobDescription("Java Developer");
        users.setAge(40);
        users.setDateOfBirth(LocalDate.of(1980, Month.DECEMBER, 7));
        List<Users> usersList = Arrays.asList(users);
        return usersList;
        // added comments
    }
}
