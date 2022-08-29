package com.example.finance.repository;

import com.example.finance.entity.CardDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, Integer>{
	
}
