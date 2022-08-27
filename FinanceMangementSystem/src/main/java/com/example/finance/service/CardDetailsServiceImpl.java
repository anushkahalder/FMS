package com.example.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finance.entity.CardDetails;
import com.example.finance.repository.CardDetailsRepository;

@Service
public class CardDetailsServiceImpl implements CardDetailsService {
	@Autowired
 private CardDetailsRepository repo;
	@Override
	public CardDetails saveCard(CardDetails card) {
		// TODO Auto-generated method stub
		return repo.save(card);
	}

}
