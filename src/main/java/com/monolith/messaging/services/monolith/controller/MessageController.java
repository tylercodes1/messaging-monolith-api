package com.monolith.messaging.services.monolith.controller;

import com.monolith.messaging.services.monolith.model.DTO.MessageDTO;
import com.monolith.messaging.services.monolith.model.Message;
import com.monolith.messaging.services.monolith.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @GetMapping("")
    public List<Message> findAll() { return messageService.findAll(); }

    @PostMapping("")
    public Message save(@RequestBody MessageDTO messageDTO) { return messageService.save(messageDTO); }
}