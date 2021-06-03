package com.tap.library.controller;

import com.tap.library.entities.UserEntity;
import com.tap.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void add(@RequestBody UserEntity userEntity){
        userService.add(userEntity);
    }

    @GetMapping
    public List<UserEntity> getAll(){
        return userService.getAll();
    }
}
