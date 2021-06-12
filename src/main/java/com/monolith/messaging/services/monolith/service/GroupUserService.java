package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.DTO.GroupUserDTO;
import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.model.GroupUser;
import com.monolith.messaging.services.monolith.model.User;
import com.monolith.messaging.services.monolith.repository.GroupRepo;
import com.monolith.messaging.services.monolith.repository.GroupUserRepo;
import com.monolith.messaging.services.monolith.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupUserService {
    @Autowired
    private GroupUserRepo groupUserRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private GroupRepo groupRepo;

    public List<GroupUser> findAll() {
        return groupUserRepo.findAll();
    }

    public GroupUser save(GroupUserDTO groupUserDTO) {
        User user = userRepo.findByUserId(groupUserDTO.getUserId());
        Group group = groupRepo.findByGroupId(groupUserDTO.getGroupId());
        return groupUserRepo.save(new GroupUser(0, user, group));
    }
}
