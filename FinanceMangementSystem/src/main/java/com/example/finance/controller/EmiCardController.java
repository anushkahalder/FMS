package com.example.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.finance.entity.CardDetails;
import com.example.finance.entity.EmiCard;
import com.example.finance.service.EmiCardService;

@RestController
public class EmiCardController {
	@Autowired
 private EmiCardService emicardservice;
	
	@GetMapping("/Emicard")
	public String getCard() {
		return "Card details is here";
	}
	
	@PostMapping("/saveecard")
	public EmiCard saveCard(@RequestBody EmiCard Ecard) {
		return emicardservice.saveCard(Ecard);
	}
}
