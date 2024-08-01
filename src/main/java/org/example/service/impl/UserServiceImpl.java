package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ObjectMapper mapper;
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        repository.save(mapper.convertValue(user, UserEntity.class));
        return "";
    }
}
