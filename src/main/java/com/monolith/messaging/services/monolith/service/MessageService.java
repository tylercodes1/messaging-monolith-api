package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.Message;
import com.monolith.messaging.services.monolith.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepo messageRepo;

    public List<Message> findAll() { return messageRepo.findAll(); }

    public Message save(Message message) { return messageRepo.save(message); }
}
