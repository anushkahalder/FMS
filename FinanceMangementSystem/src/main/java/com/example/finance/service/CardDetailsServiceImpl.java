package com.example.finance.service;

import javax.persistence.TypedQuery;

import com.example.finance.entity.Admin;
import com.example.finance.entity.CardDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardDetailsServiceImpl implements CardDetailsService{

	@Autowired
	private UserService userService; 
	
	@Override
	public CardDetails getCardDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardDetails setCardDetails(long uid) {
		userService.findById(uid);
        return null;
	}

//	@Override
//	public CardDetails updateBal(long reg_id, int price) {
//		// TODO Auto-generated method stub
//		
//		return ;
//	}
	
	
}
