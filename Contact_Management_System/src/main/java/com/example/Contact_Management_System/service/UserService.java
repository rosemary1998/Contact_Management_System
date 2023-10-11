package com.example.Contact_Management_System.service;

import com.example.Contact_Management_System.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    void deleteUser(Long id);
}
