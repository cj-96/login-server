package org.example.service;

import org.example.dto.User;

public interface UserService {
    public boolean login(User user);

    public String register(User user);
}
