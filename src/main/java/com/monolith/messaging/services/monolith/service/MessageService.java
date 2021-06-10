package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.DTO.MessageDTO;
import com.monolith.messaging.services.monolith.model.Message;
import com.monolith.messaging.services.monolith.model.User;
import com.monolith.messaging.services.monolith.repository.MessageRepo;
import com.monolith.messaging.services.monolith.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepo messageRepo;

    @Autowired
    private UserRepo userRepo;

    public List<Message> findAll() { return messageRepo.findAll(); }

    public Message save(MessageDTO messageDTO) {
        User user = userRepo.findByUserId(messageDTO.getUserId());
        Message message = new Message(0, messageDTO.getMessage(), user);
        return messageRepo.save(message);
    }
}
