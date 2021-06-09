package com.monolith.messaging.services.monolith.controller;

import com.monolith.messaging.services.monolith.model.User;
import com.monolith.messaging.services.monolith.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> getUsers() { return userService.findAll(); }
}
