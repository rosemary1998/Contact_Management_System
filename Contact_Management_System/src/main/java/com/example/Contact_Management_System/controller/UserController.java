package com.example.Contact_Management_System.controller;

import com.example.Contact_Management_System.model.User;
import com.example.Contact_Management_System.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }
    @PostMapping
  public ResponseEntity<User>saveUser(@RequestBody User user)  {
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
  }
  @GetMapping
  public List<User>getALLUser(){
        return userService.getAllUser();
  }
  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteUser(@PathVariable("id")Long id){
        userService.deleteUser(id);
        return new ResponseEntity<String>("User deleted successfully.",HttpStatus.OK);

  }

}
