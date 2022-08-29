package com.example.finance.controller;

import com.example.finance.entity.CardDetails;
import com.example.finance.entity.User;
import com.example.finance.service.CardDetailsService;
import com.example.finance.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carddetails")
public class CardDetailsController {
	
	@Autowired
	CardDetailsService cardService;
	
	@Autowired
	UserService userservice;

	@PostMapping("/set/{id}")
	public CardDetails cardDetails(@RequestBody CardDetails cardDetails,@PathVariable("id") long userId){
		return cardService.saveInitialCardDetails(cardDetails,userId);
	}

	//@PostMapping("/setcard/{id}")
	//public CardDetails setCardDetails(@PathVariable("id") long uid) {
	//	return cardService.setCardDetails(uid);
	//}
	
//	@GetMapping("/getcard/{id}")
//	public CardDetails getCardDetails(@PathVariable("id") long uid) {
//		return cardService.getCardDetails(uid);
//	}
//
	
//	@PutMapping("/updatebal/{regid}/{price}")
//	public CardDetails updateBal(@PathVariable("reg_id") long reg_id, @PathVariable("price") int price){
//		return cardService.updateBal(reg_id, price);
//	}
}
