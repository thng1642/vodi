package com.example.vodionlinemoviewebsite.repository;

import com.example.vodionlinemoviewebsite.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface AccountRepository extends JpaRepository<AccountModel, Integer> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO account (userName, password) values(?1, ?2)",
            nativeQuery = true)
    void insertNewAccount(String email, String password);
}
