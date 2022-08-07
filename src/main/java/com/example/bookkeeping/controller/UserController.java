package com.example.bookkeeping.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/")
    public ResponseEntity getUsers(){
        try {
            return ResponseEntity.ok("Request completed");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PostMapping("/")
    public ResponseEntity createUser(){
        try {
            return ResponseEntity.ok("Request completed");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable long id){
        try {
            return ResponseEntity.ok("Request completed " + id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUserInfoById(@PathVariable long id){
        try {
            return ResponseEntity.ok("Request completed " + id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
