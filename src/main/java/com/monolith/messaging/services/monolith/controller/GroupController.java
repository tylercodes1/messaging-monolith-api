package com.monolith.messaging.services.monolith.controller;

import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.model.GroupUser;
import com.monolith.messaging.services.monolith.service.GroupService;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("")
    public List<Group> findAll() {
        return groupService.findAll();
    }

    @GetMapping("/{id}")
    public Group findByGroupId(@PathVariable("id") int id) {
        return groupService.findByGroupId(id);
    }

    @GetMapping("/user/{id}")
    public List<GroupUser> findGroupsByUserId(@PathVariable("id") int id) { return groupService.findGroupsByUserId(id); }

    @PostMapping("")
    public Group save(@RequestBody Group group) {
        return groupService.save(group);
    }

}
