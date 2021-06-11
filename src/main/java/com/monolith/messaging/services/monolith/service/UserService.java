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
//        String firstName = userDTO.getFirstName();
//        String lastName = userDTO.getLastName();
//        String username = userDTO.getUsername();
//        String email = userDTO.getEmail();
//        Set<Group> groups = new HashSet<>();
//        for (Integer i : userDTO.getGroupIds())
//            groups.add(new Group(i));
//        User user = new User(0, firstName, lastName, username, email, groups);
        return userRepo.save(user);
    }

    public User findByUserId(int id) {
        return userRepo.findByUserId(id);
    }

    public User addGroupUser(int userId, int groupId) {
        User user = userRepo.findByUserId(userId);
        Group group = groupRepo.findByGroupId(groupId);
        Set<Group> groups = user.getGroups();
        groups.add(group);
        user.setGroups(groups);
        return userRepo.save(user);
    }
}
