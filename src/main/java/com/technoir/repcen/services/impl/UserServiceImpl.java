package com.technoir.repcen.services.impl;

import com.technoir.repcen.controllers.dto.RegistrationUserDto;
import com.technoir.repcen.domain.Role;
import com.technoir.repcen.domain.User;
import com.technoir.repcen.repository.UserRepository;
import com.technoir.repcen.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(RegistrationUserDto registrationUserDto) {
        User user = new User();
        user.setFirstName(registrationUserDto.getFirstName());
        user.setLastName(registrationUserDto.getLastName());
        user.setMiddleName(registrationUserDto.getMiddleName());
        user.setEmail(registrationUserDto.getEmail());
        user.setPassword(registrationUserDto.getPassword());
        user.setRoles(Collections.singleton(Role.ADMIN));
        userRepository.save(user);
        return user;
    }


}
