package com.pelinhangisi.springboottodoapp.controller;

import com.pelinhangisi.springboottodoapp.request.AddUserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLoginForm(){
        return "index";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute(name = "loginForm") AddUserRequest addUserRequest, Model model){
        String username = addUserRequest.getUsername();
        String password = addUserRequest.getPassword();

        if("admin".equals(username) && "admin".equals(password)){
            //todo if result  correct redirect todo page EDIT
            return "todolist";
        }model.addAttribute("invalidCredentials", true);
        return "index";
    }
}
