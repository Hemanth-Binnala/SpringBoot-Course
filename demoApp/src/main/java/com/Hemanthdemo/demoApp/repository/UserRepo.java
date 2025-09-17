package com.Hemanthdemo.demoApp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Hemanthdemo.demoApp.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findAllByUsername(String username);

}
