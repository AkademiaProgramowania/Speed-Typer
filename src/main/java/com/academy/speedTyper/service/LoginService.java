package com.academy.speedTyper.service;

import com.academy.speedTyper.dto.LoginRequestDTO;
import com.academy.speedTyper.model.User;
import com.academy.speedTyper.repository.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private UserRepository repository;

    public LoginService(UserRepository repository) {
        this.repository = repository;
    }

    public void login(LoginRequestDTO request) {
        System.out.println(request);
        Optional<User> optional = repository.findById(request.getLogin());
        if (optional.isPresent()) {
            System.out.println("jest taki user");
            User user = optional.get();
            if (user.getPassword().equals(request.getPassword())) {
                System.out.println("Zalogowany!");
            } else {
                System.out.println("Złe hasło");
            }
        } else {
            System.out.println("brak takiego uzytkownika");
        }
    }
}
