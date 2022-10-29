package com.hide.register001.controller;

import com.hide.register001.entity.User;
import com.hide.register001.mapper.UserMapper;
import com.hide.register001.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @PostMapping("/register")
    public String Register(User user) {
        return userService.register(user);
    }
    @RequestMapping("/login")
    public String login(User user) {
        return userService.login(user);
    }

}
