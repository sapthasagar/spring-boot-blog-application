package com.sagar.spring_boot_blog_application.services;

import com.sagar.spring_boot_blog_application.models.Account;
import com.sagar.spring_boot_blog_application.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    public Account save(Account account){
        return accountRepository.save(account);
    }

    public Optional<Account> findByEmail(String email) {
        return accountRepository.findOneByEmail(email);
    }
}
