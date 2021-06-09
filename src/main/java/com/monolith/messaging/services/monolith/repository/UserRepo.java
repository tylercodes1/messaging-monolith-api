package com.monolith.messaging.services.monolith.repository;

import com.monolith.messaging.services.monolith.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
