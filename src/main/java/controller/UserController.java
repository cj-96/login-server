package controller;

import dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/login")
public class UserController {

    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return false;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return "";
    }
}
