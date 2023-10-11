package com.example.Contact_Management_System.service.impl;

import com.example.Contact_Management_System.exception.ResourceNotFountException;
import com.example.Contact_Management_System.model.User;
import com.example.Contact_Management_System.repository.UserRepository;
import com.example.Contact_Management_System.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    public UserServiceimpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.findById(id).orElseThrow(
                ()->new ResourceNotFountException("User","PhNumber",id));
        userRepository.deleteById(id);

    }
}
