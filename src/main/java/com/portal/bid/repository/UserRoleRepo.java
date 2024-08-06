package com.portal.bid.repository;

import com.portal.bid.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepo extends JpaRepository<UserRoles,Integer> {
}
