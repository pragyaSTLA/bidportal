package com.portal.bid.repository;

import com.portal.bid.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


    User findByUsername(String username);
}
