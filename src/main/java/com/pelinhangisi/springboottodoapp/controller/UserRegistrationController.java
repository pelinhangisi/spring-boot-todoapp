package com.pelinhangisi.springboottodoapp.controller;

import com.pelinhangisi.springboottodoapp.request.UserRegistrationRequest;
import com.pelinhangisi.springboottodoapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
@RequiredArgsConstructor
public class UserRegistrationController {

    private final UserService userService;

    public String registerUser(@ModelAttribute("user")UserRegistrationRequest userRegistrationRequest){
        userService.save(userRegistrationRequest);
        return "redirect:/redirect?success";
    }
}
