package com.example.demo.service;

import com.example.demo.model.AccountModel;
import com.example.demo.repository.AccountRepository;
import com.example.demo.responses.AccountResponse;
import lombok.Builder;
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

    public ResponseEntity<AccountResponse> createAccount(AccountResponse accountResponse) {
        AccountModel accountModel = new AccountModel(accountResponse.getId(),
                accountResponse.getFName(),
                accountResponse.getSName(),
                accountResponse.getBalance());
        accountRepository.save(accountModel);
        return new ResponseEntity<>(accountResponse, HttpStatus.OK);
    }
}

