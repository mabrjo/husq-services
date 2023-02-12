package com.example.task_manager.controller;


import com.example.task_manager.model.User;
import com.example.task_manager.repository.UserRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public User save(@Validated @NotNull @RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping
    public User update(@Validated @NotNull @RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}


