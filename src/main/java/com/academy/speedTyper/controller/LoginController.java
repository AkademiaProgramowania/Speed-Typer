package com.academy.speedTyper.controller;

import com.academy.speedTyper.dto.LoginRequestDTO;
import com.academy.speedTyper.dto.RegisterRequestDTO;
import com.academy.speedTyper.service.LoginService;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login.html";
    }

    @PostMapping("/login")
    public String login(LoginRequestDTO request) {
        loginService.login(request);
        return "home.html";
    }
}


