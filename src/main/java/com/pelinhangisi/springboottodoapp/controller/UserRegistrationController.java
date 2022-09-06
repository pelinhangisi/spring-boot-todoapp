package com.pelinhangisi.springboottodoapp.controller;


import com.pelinhangisi.springboottodoapp.request.UserRegistrationRequest;
import com.pelinhangisi.springboottodoapp.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class UserRegistrationController {

    private final UserService userService;

    @ModelAttribute("user")
    public UserRegistrationRequest userRegistrationRequest(){
        return new UserRegistrationRequest();
    }

    @GetMapping
    public String showRegistration(){
        return "registration";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") UserRegistrationRequest userRegistrationRequest){
        userService.save(userRegistrationRequest);
        return "redirect:/redirect?success";
    }
}
