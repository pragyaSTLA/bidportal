package com.portal.bid.service;

import com.portal.bid.entity.UserRoles;

import java.util.Optional;

public interface UserRolesService {

    UserRoles save(UserRoles userroles);

    Optional<UserRoles> updateUser(int id, UserRoles userroles);

    Optional<UserRoles> get(int id);

    void delete(int id);
}
