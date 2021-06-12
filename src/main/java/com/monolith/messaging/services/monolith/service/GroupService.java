package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.model.GroupUser;
import com.monolith.messaging.services.monolith.model.User;
import com.monolith.messaging.services.monolith.repository.GroupRepo;
import com.monolith.messaging.services.monolith.repository.GroupUserRepo;
import com.monolith.messaging.services.monolith.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class GroupService {
    @Autowired
    GroupRepo groupRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    GroupUserRepo groupUserRepo;

    public List<Group> findAll() {
        return groupRepo.findAll();
    }

    public Group save(Group group) {
        return groupRepo.save(group);
    }

    public Group findByGroupId(int id) {
        return groupRepo.findByGroupId(id);
    }

    public List<GroupUser> findGroupsByUserId(int id) {
        User user = userRepo.findByUserId(id);
        return groupUserRepo.findByUser(user);
    }
}
