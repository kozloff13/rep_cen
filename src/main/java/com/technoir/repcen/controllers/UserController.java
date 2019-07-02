package com.technoir.repcen.controllers;

import com.technoir.repcen.controllers.dto.UserDto;
import com.technoir.repcen.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public UserDto createUser(@RequestBody UserDto userDto) {
        return UserDto.fromUser(userService.register(userDto));
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
}
