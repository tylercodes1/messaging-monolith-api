package com.monolith.messaging.services.monolith.service;

import com.monolith.messaging.services.monolith.model.DTO.MessageDTO;
import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.model.Message;
import com.monolith.messaging.services.monolith.model.User;
import com.monolith.messaging.services.monolith.repository.GroupRepo;
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

    @Autowired
    private GroupRepo groupRepo;

    public List<Message> findAll() { return messageRepo.findAll(); }

    public Message save(MessageDTO messageDTO) {
        User user = userRepo.findByUserId(messageDTO.getUserId());
        Group group = groupRepo.findByGroupId(messageDTO.getGroupId());
        Message message = new Message(0, messageDTO.getMessage(), user, group);
        return messageRepo.save(message);
    }

    public List<Message> findAllByGroupId(int id) {
        Group group = groupRepo.findByGroupId(id);
        return messageRepo.findByGroup(group);
    }
}
