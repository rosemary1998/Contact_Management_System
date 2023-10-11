package com.example.Contact_Management_System.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    private String address;
    @Column(nullable = false,unique = true)
    private String phNumber;
    private String email;

}
