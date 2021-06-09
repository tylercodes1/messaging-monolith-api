package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.User;
import com.monolith.messaging.services.monolith.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
