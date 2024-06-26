package com.portal.bid.controller;


import com.portal.bid.entity.User;
import com.portal.bid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<String> saveUser(@RequestBody User u){
        System.out.println("saving user");
        if (userService.findByUsername(u.getUsername()) != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already exists.");
        }
        userService.saveUser(u);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully.");
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User u){
        try {
            userService.loginUser(u);
            return ResponseEntity.status(HttpStatus.OK).body("Login successful.");
        } catch (UsernameNotFoundException | BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error during login.");
        }
    }





}
