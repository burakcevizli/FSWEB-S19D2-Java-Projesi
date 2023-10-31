package com.Bank.bank.dao;

import com.Bank.bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account,Integer> {
}
