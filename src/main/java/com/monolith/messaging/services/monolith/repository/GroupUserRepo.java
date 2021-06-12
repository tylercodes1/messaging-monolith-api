package com.monolith.messaging.services.monolith.repository;

import com.monolith.messaging.services.monolith.model.GroupUser;
import com.monolith.messaging.services.monolith.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface GroupUserRepo extends JpaRepository<GroupUser, Integer> {
    List<GroupUser> findByUser(User user);
}
