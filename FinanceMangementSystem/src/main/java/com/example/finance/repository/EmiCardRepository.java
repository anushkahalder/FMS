package com.example.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finance.entity.EmiCard;

@Repository

public interface EmiCardRepository extends JpaRepository< EmiCard, String> {

}
