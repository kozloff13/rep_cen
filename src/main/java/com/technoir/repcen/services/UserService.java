package com.technoir.repcen.services;

import com.technoir.repcen.controllers.dto.UserDto;
import com.technoir.repcen.domain.User;

public interface UserService {

    User register(UserDto userDto);
}
