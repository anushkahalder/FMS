package com.example.finance.service;

import com.example.finance.entity.CardDetails;

public interface CardDetailsService {

	//public CardDetails getCardDetails();

	public CardDetails saveInitialCardDetails(CardDetails cardDetails,long userId);

	//public CardDetails updateBal(long reg_id, int price);

}
