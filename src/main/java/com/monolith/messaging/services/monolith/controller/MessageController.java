package com.monolith.messaging.services.monolith.controller;

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
    public Message save(@RequestBody Message message) { return messageService.save(message); }
}
