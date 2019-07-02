package com.technoir.repcen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/login")
    public String testLogin() {
        return "TESTETSETSTETSTEHJGBLJHVJHVL:JHV:KJB:KJB:KJB:KJBL:KJ";
    }
}
