package com.esi.BonnOccasion.repository;


import com.esi.BonnOccasion.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
