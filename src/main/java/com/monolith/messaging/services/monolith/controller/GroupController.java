package com.monolith.messaging.services.monolith.controller;

import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.service.GroupService;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("")
    public List<Group> findAll() {
        return groupService.findAll();
    }

    @GetMapping("/{id}")
    public Group findByGroupId(@PathVariable int id) {
        return groupService.findByGroupId(id);
    }

    @PostMapping("")
    public Group save(@RequestBody Group group) {
        return groupService.save(group);
    }
}
