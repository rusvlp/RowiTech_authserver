package com.example.rowitech_authserver.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {


    @GetMapping("/login")
    public String loginPage(){
        return "user/login";
    }

    @GetMapping("/registration")
    public String regPage(){
        return "user/registration";
    }

    @PostMapping("/registration")
    public String registration(Model model){
        model.addAttribute("message", "");
        model.addAttribute("title", "");
        return "message";
    }
}
