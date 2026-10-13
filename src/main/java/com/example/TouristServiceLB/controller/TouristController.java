package com.example.TouristServiceLB.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TouristController {

    @Value("${server.port:8082}")
    private int port;

    @GetMapping("/tourists")
    public String getTourists() {
        return "Tourist Service is running on port: " + port;
    }
}