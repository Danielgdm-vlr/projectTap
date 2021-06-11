package com.tap.library.controller.v1;

import com.tap.library.model.dto.UserDto;
import com.tap.library.model.entities.UserEntity;
import com.tap.library.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private final UserServiceImpl userServiceImpl;

    @Autowired
    public UserController(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping
    public void add(@RequestBody UserDto userDto){
        userServiceImpl.add(userDto);
    }

    @GetMapping
    public List<UserDto> getAll(){
        return userServiceImpl.getAll();
    }
}
