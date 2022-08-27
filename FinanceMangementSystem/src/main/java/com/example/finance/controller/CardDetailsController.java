package com.example.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.finance.entity.CardDetails;
import com.example.finance.service.CardDetailsService;

@RestController
public class CardDetailsController {

	@Autowired
	private CardDetailsService carddetailsservice;
	
	@GetMapping("/card")
	public String getCard() {
		return "Card details is here";
	}
	
	@PostMapping("/savecard")
	public CardDetails saveCard(@RequestBody CardDetails card) {
		return carddetailsservice.saveCard(card);
	}
}
