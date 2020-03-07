package com.example.demo.controller;

import com.example.demo.responses.AccountResponse;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class AccountController {
    AccountService accountService;

    @Autowired
    AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(path = "/account", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createAcc(@RequestBody AccountResponse accountResponse) {
        accountService.createAccount(accountResponse);
    }
}
