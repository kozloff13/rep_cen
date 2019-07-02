package com.technoir.repcen.controllers;

import com.technoir.repcen.controllers.dto.RegistrationUserDto;
import com.technoir.repcen.controllers.dto.UserDto;
import com.technoir.repcen.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private static final String template = "Hello, BLATB!";

    @PostMapping("/create")
    public UserDto createUser(@RequestBody RegistrationUserDto registrationUserDto) {
        return UserDto.fromUser(userService.register(registrationUserDto));
    }

    @GetMapping("/get")
    public String getTemplate(){
        return template;
    }
}
