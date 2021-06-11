package com.monolith.messaging.services.monolith.repository;

import com.monolith.messaging.services.monolith.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepo extends JpaRepository<Group, Integer> {
    Group findByGroupId(int groupId);
}
