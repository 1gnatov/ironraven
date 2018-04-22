package com.ironbank.moneyraven.dao;

import com.ironbank.moneyraven.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyDao extends JpaRepository<Bank, Long> {
}
