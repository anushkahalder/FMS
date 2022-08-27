package com.example.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finance.entity.EmiCard;
import com.example.finance.repository.EmiCardRepository;

@Service
public class EmiCardServiceImpl implements EmiCardService {
	@Autowired
  private EmiCardRepository emirepo;
	@Override
	public EmiCard saveCard(EmiCard ecard) {
		// TODO Auto-generated method stub
		return emirepo.save(ecard);
	}

}
