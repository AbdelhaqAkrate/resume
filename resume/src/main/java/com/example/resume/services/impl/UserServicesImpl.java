package com.example.resume.services.impl;

import java.util.List;
import java.util.Optional;

import com.example.resume.entity.User;
import com.example.resume.repository.UserRepository;
import com.example.resume.services.UserServices;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    private final UserRepository userRepository;
    public UserServicesImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public User findById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }else {
            throw new RuntimeException("User not found for id :: " + id);
        }

    }
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public User findByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email).stream().findFirst();
        if (user.isPresent()) {
            return user.get();
    }
    else {
        throw new RuntimeException("User not found for email :: " + email);
    }
    }
}
