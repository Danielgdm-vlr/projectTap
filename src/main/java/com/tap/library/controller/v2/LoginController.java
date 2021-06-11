package com.tap.library.controller.v2;

import com.tap.library.model.dto.UserDto;
import com.tap.library.service.implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public record LoginController(UserServiceImpl userServiceImpl) {
    @Autowired
    public LoginController {
    }

    //this method returns a userDto if it finds one with the given parameters(which come from frontend)
    //and if it doesnt find it returns a null, so in frontend if the result of this get is null, then a msg box that no user was found
    //should be shown
    @RequestMapping(value = "api/v2/login", method = RequestMethod.GET)
    @GetMapping
    @ResponseBody
    public UserDto userFound(@RequestParam String username, String password) {
        return userServiceImpl.userFound(username, password);
    }
}
