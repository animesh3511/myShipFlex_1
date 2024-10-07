package com.example.user_verification.repository;

import com.example.user_verification.model.CardData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardDataRepository extends JpaRepository<CardData, Long> {


    boolean existsByFingerPrintAndCustomerId(String fingerprint, String customerId);


    CardData findByLast4AndCustomerId(String cardLast4, String customerId);
}
