package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.GroupUser;
import com.monolith.messaging.services.monolith.repository.GroupUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupUserService {
    @Autowired
    GroupUserRepo groupUserRepo;

    public List<GroupUser> findAll() {
        return groupUserRepo.findAll();
    }
}
