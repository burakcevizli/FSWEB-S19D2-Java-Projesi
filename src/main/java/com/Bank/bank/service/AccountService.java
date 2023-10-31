package com.Bank.bank.service;


import com.Bank.bank.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
}
