package com.rajat13.redisclusterspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        repository.save(user);
        return user;
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable String id){
        Optional<User> result = repository.findById(id);
        return result;
    }


}
