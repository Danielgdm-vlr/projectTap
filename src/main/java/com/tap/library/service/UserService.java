package com.tap.library.service;

import com.tap.library.model.dto.UserDto;

import java.util.List;

public interface UserService {
    void add(UserDto userDto);

    List<UserDto> getAll();
}
