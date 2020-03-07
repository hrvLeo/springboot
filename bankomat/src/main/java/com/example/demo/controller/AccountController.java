package com.example.demo.controller;

import com.example.demo.requests.AccountRequest;
import com.example.demo.responses.AccountResponse;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AccountController {
    AccountService accountService;

    @Autowired
    AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(path = "/account", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AccountResponse> createAcc(@RequestBody AccountRequest accountRequest) {
        Long accountId = accountService.createAccount(accountRequest);
        AccountResponse response = AccountResponse.builder()
                .message(String.format("Account created with id: %s", accountId))
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
