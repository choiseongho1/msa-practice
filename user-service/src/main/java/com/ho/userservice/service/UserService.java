package com.ho.userservice.service;


import com.ho.userservice.dto.UserDto;
import com.ho.userservice.jpa.UserEntity;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
