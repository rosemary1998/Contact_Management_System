package com.example.Contact_Management_System.repository;

import com.example.Contact_Management_System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
