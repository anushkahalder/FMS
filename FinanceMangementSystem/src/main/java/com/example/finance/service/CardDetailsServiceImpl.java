package com.example.finance.service;

import javax.persistence.TypedQuery;

import com.example.finance.entity.Admin;
import com.example.finance.entity.CardDetails;
import com.example.finance.entity.User;

import com.example.finance.repository.CardDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardDetailsServiceImpl implements CardDetailsService{

	@Autowired
	private CardDetailsRepository cardDetailsRepository;

	@Autowired
	private UserService userService; 
	
//	@Override
//	public CardDetails getCardDetails() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public CardDetails saveInitialCardDetails(CardDetails cardDetails,long userId) {
		User user = userService.getUserById(userId);
		 cardDetails.setUser(user);
		return cardDetailsRepository.save(cardDetails);
	}

//	@Override
//	public CardDetails updateBal(long reg_id, int price) {
//		// TODO Auto-generated method stub
//		
//		return ;
//	}
	
	
}
