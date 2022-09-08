package com.example.serviceb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class ServiceBController {
    @GetMapping()
    ResponseEntity<String> healthCheck(){
        return new ResponseEntity<String>("service B is being called from A",HttpStatus.OK);
    }
}
