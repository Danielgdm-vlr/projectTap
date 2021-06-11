package com.tap.library.service;

import com.tap.library.model.dto.UserDto;
import com.tap.library.model.entities.UserEntity;
import com.tap.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void add(UserDto userDto){
        userRepository.save(convertDtoToEntity(userDto));
    }

    public List<UserDto> getAll(){
        List<UserEntity> userEntityList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        for(UserEntity userEntity: userEntityList){
            userDtoList.add(convertEntityToDto(userEntity));
        }

        return userDtoList;
    }

    public UserDto userFound(String username, String password){
        if(userRepository.findByUsername(username) != null){
            UserEntity userEntity = userRepository.findByUsername(username).get(0);
            if (userEntity.getPassword().equals(password)){
                return convertEntityToDto(userEntity);
            }
        }

        return null;
    }

    private UserEntity convertDtoToEntity(UserDto userDto){
        return new UserEntity(
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getCnp(),
                userDto.getEmailAddress(),
                userDto.getTelephoneNumber(),
                userDto.isManager() //false
        );
    }

    private UserDto convertEntityToDto(UserEntity userEntity){
        return new UserDto(
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getCnp(),
                userEntity.getEmail(),
                userEntity.getTelephoneNumber(),
                userEntity.isManager()
        );
    }
}
