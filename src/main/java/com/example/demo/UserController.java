package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getInformation")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getInformation/{id}")
    public Optional<UserEntity> getUserById(@PathVariable String id) {
        return userService.getUserByID(id);
    }

    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserEntity user) {
        System.out.println(user);
        return userService.createUser(user);
    }
}
