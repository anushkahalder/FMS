package com.example.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finance.entity.CardDetails;
@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails,Integer >{

}
