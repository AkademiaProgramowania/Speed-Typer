package com.academy.speedTyper.service;

import com.academy.speedTyper.dto.RegisterRequestDTO;
import com.academy.speedTyper.model.User;
import com.academy.speedTyper.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private UserRepository userRepository;

    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(RegisterRequestDTO request) {
        //upewnić się, że dwa hasła się zgadzają
        User user = new User(request.getEmail(), request.getPassword());
        System.out.println(user);
        userRepository.save(user);
    }

}
