package com.springwell.service;

import com.springwell.model.Users;
import org.springframework.stereotype.Service;

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
        users.setDepartment("IT Team Lead");

        Users users2 = new Users();
        users2.setId(2L);
        users2.setFirstName("Raghu");
        users2.setLastName("Singh");
        users2.setEmail("leo_raghu@hotmail.com");
        users2.setDepartment("Junior developer");

        return Arrays.asList(users, users2);
    }
}
