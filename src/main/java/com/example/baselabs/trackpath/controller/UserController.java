package com.example.baselabs.trackpath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.baselabs.trackpath.model.User;
import com.example.baselabs.trackpath.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user) {

        User newUser = userRepository.findById(user.getId()).orElse(null);
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());      

        return userRepository.save(newUser);
    }

    @DeleteMapping("/{id}")
    public Long deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return id;
    }


}
