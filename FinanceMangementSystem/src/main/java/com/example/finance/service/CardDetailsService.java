package com.example.finance.service;

import com.example.finance.entity.CardDetails;

public interface CardDetailsService {

	public CardDetails getCardDetails();

	public CardDetails setCardDetails(long uid);

	public CardDetails updateBal(long reg_id, int price);

}
