package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique =true)
    private String username;
    private String password;

    public String getPassword() {

        return null;
    }

    public String getUsername() {
        return null;
    }

    public void setPassword(String encode) {
    }
}
