package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserByID(String ids) {
        return userRepository.findById(ids);
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }


    // You can add other CRUD operations and custom queries here
}
