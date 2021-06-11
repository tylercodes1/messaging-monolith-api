package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.repository.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    GroupRepo groupRepo;


    public List<Group> findAll() {
        return groupRepo.findAll();
    }

    public Group save(Group group) {
        return groupRepo.save(group);
    }

    public Group findByGroupId(int id) {
        return groupRepo.findByGroupId(id);
    }
}
