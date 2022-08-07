package com.example.bookkeeping.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users/{userId}/accounts/{accountId}/transactions")
public class TransactionsController {

    @GetMapping
    public ResponseEntity getUserAccountTransactions(){
        try {
            return ResponseEntity.ok("Request completed");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PostMapping
    public ResponseEntity createUserAccountTransaction(){
        try {
            return ResponseEntity.ok("Request completed");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("{transactionId}")
    public ResponseEntity getUserAccountTranscationById(@PathVariable long transactionId){
        try {
            return ResponseEntity.ok("Request completed " + transactionId);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
