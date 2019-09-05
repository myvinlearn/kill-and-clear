package com.example.demo.awsdevopsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crush")
public class MyController {

    @GetMapping("/getMe")
    public String hello(){
        return "Welcome to my learning World!!";
    }
}
