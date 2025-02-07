package com.Bank.bank.dao;

import com.Bank.bank.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MemberDao extends JpaRepository<Member,Integer> {
    @Query("SELECT m FROM Member m WHERE m.email=:email")
     Optional<Member> findByEmail(String email);


}
