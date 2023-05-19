package com.academy.speedTyper.controller;

import com.academy.speedTyper.dto.RegisterRequestDTO;
import com.academy.speedTyper.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register.html";
    }

    @PostMapping("/register")
    public String register(RegisterRequestDTO request) {
        registerService.register(request);
        return "login.html";
    }
}
