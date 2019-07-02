package com.technoir.repcen.services.impl;

import com.technoir.repcen.controllers.dto.UserDto;
import com.technoir.repcen.domain.Role;
import com.technoir.repcen.domain.User;
import com.technoir.repcen.repository.UserRepository;
import com.technoir.repcen.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setMiddleName(userDto.getMiddleName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setRoles(Collections.singleton(Role.ADMIN));
        userRepository.save(user);
        return user;
    }


}
