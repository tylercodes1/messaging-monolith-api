package com.monolith.messaging.services.monolith.controller;

import com.monolith.messaging.services.monolith.model.DTO.UserDTO;
import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.model.User;
import com.monolith.messaging.services.monolith.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> findAll() { return userService.findAll(); }

    @PostMapping("")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User findByUserId(@PathVariable("id") int id) {
        return userService.findByUserId(id);
    }
}
