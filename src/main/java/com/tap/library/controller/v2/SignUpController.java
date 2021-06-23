package com.tap.library.controller.v2;

import com.tap.library.model.dto.UserDto;
import com.tap.library.service.implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public record SignUpController(UserServiceImpl userServiceImpl) {
    @Autowired
    public SignUpController {
    }

    @RequestMapping("api/v2/signUp")
    @ResponseBody
    @PostMapping
    public void signIn(@RequestBody UserDto userDto){
        userServiceImpl.add(userDto);
    }
}
