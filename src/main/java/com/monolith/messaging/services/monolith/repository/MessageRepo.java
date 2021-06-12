package com.monolith.messaging.services.monolith.repository;

import com.monolith.messaging.services.monolith.model.Group;
import com.monolith.messaging.services.monolith.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepo extends JpaRepository<Message, Integer> {
    List<Message> findByGroup(Group group);
}
