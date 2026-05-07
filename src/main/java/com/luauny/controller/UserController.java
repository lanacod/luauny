package com.luauny.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luauny.model.User;
import com.luauny.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService crazy) {
        this.service = crazy;

    }

    @GetMapping
    public List<User> findAll() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public User create(@RequestBody @Valid User asd) {
        return service.create(asd);
    }
}
