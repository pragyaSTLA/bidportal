package com.portal.bid.service;

import com.portal.bid.entity.User;

public interface UserService {
    void saveUser(User u);

    User findByUsername(String username);

    void loginUser(User u);
}
