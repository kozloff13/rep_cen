package com.technoir.repcen.services;

import com.technoir.repcen.controllers.dto.RegistrationUserDto;
import com.technoir.repcen.domain.User;

public interface UserService {

    User register(RegistrationUserDto registrationUserDto);
}
