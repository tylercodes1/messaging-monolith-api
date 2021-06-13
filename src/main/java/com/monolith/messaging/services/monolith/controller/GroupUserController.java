package com.monolith.messaging.services.monolith.controller;

import com.monolith.messaging.services.monolith.model.DTO.GroupUserDTO;
import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.model.GroupUser;
import com.monolith.messaging.services.monolith.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/groupuser")
public class GroupUserController {
    @Autowired
    GroupUserService groupUserService;

    @GetMapping("")
    public List<GroupUser> findAll() {
        return groupUserService.findAll();
    }

    @PostMapping("")
    public GroupUser save(@RequestBody GroupUserDTO groupUserDTO) {
        return groupUserService.save(groupUserDTO);
    }
}