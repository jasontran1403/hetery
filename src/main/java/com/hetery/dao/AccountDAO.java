package com.hetery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hetery.entity.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, String> {

}
