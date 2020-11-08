package com.springwell.controller;

import java.util.List;
import com.springwell.model.Users;
import com.springwell.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResource {

    private UsersService usersService;

    @Autowired
    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public List<Users> getAllUsers() {
        List<Users> usersList = usersService.getAllUsers();
        return usersList;
    }
}
