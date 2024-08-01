package org.example.controller;

import org.example.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.example.service.UserService;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/login")
public class UserController {

    final UserService service;

    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return service.login(user);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return service.register(user);
    }
}
