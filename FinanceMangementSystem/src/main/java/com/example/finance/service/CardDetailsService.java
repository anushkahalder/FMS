package com.example.finance.service;

import com.example.finance.entity.CardDetails;

import javax.persistence.criteria.CriteriaBuilder;

public interface CardDetailsService {

//	public CardDetails getCardDetails(long userId);

	public CardDetails saveInitialCardDetails(long userId);

//	Integer setCardDetails(long uid);

	//public CardDetails updateBal(long reg_id, int price);

}
