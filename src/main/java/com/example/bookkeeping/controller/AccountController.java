package com.example.bookkeeping.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/{userId}/accounts")
public class AccountController {

    @GetMapping
    public ResponseEntity getUserAccounts(@PathVariable long userId){
        try {
            return ResponseEntity.ok("Request completed " + userId);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("{accountId}")
    public ResponseEntity getUserAccountById(@PathVariable long userId, @PathVariable String accountId){
        try {
            return ResponseEntity.ok("Request completed. user id: " + userId + " account id: "+ accountId);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PostMapping
    public ResponseEntity createNewAccount(@PathVariable long userId, @PathVariable String accountId){
        try {
            return ResponseEntity.ok("Request completed. user id: " + userId + " account id: "+ accountId);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PatchMapping("{accountId}")
    public ResponseEntity updateAccountInfo(@PathVariable long userId, @PathVariable String accountId){
        try {
            return ResponseEntity.ok("Request completed. user id: " + userId + " account id: "+ accountId);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
