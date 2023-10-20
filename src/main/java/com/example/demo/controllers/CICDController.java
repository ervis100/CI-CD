package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CICDController {

    @Value("${response.welcome}")
    private String welcome;

    @GetMapping("/welcome")
    public String welcome() {
        return String.format("Ervis,  %s", welcome);
    }

}
