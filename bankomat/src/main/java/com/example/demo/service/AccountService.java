package com.example.demo.service;

import com.example.demo.model.AccountModel;
import com.example.demo.repository.AccountRepository;
import com.example.demo.requests.AccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    AccountRepository accountRepository;

    @Autowired
    AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long createAccount(AccountRequest accountRequest) {
        AccountModel accountModel = AccountModel.builder()
                .id(accountRequest.getId())
                .fName(accountRequest.getFName())
                .sName(accountRequest.getSName())
                .balance(accountRequest.getBalance())
                .build();

        return accountRepository.save(accountModel).getId();
    }
}

