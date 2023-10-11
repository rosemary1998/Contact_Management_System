package com.example.Contact_Management_System.controller;

import com.example.Contact_Management_System.controller.UserController;
import com.example.Contact_Management_System.model.User;
import com.example.Contact_Management_System.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserControllerTest {
    private UserController userController;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = mock(UserService.class);
        userController = new UserController(userService);
    }

    @Test
    void saveUser() {
        User user = new User();

        when(userService.saveUser(user)).thenReturn(user);

        ResponseEntity<User> response = userController.saveUser(user);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    void getALLUser() {

        List<User> userList = userController.getALLUser();

    }

    @Test
    void deleteUser() {
        Long userId = 1L;

        ResponseEntity<String> response = userController.deleteUser(userId);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
