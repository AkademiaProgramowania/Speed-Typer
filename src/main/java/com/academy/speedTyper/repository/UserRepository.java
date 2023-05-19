package com.academy.speedTyper.repository;

import com.academy.speedTyper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {


}
