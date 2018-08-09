package com.mkyong.auth.service;

import com.mkyong.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
