package com.luauny.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luauny.model.User;
import com.luauny.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository fuba) {
        this.repository = fuba;

    }

    public List<User> findAll() {
        return repository.findAll();

    }

    public User findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

    }

    public User create(User userFuba) {
        return repository.save(userFuba);
    }
}