package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.DTO.UserDTO;
import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.model.User;
import com.monolith.messaging.services.monolith.repository.GroupRepo;
import com.monolith.messaging.services.monolith.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private GroupRepo groupRepo;

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public User findByUserId(int id) {
        return userRepo.findByUserId(id);
    }
}
