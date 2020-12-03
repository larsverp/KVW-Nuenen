package com.example.KVWNuenen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/login")
public class LoginController {

    @Autowired
    public LoginController() {
    }

    @PostMapping(path = "/parent")
    public String Parent(){
        return "Hello parent";
    }

    @PostMapping(path = "/volunteer")
    public String Volunteer(){
        return "Hello volunteer";
    }

}

