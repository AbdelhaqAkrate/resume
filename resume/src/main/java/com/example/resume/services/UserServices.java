package com.example.resume.services;

import com.example.resume.entity.User;

import java.util.List;

public interface UserServices {
    List<User> getAllUsers();
    User findById(Integer id);
    User saveUser(User user);
    User findByEmail(String email);
}
