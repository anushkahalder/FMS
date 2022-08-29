package com.example.finance.service;

import com.example.finance.entity.Admin;
import com.example.finance.entity.CardDetails;
import com.example.finance.entity.User;
import com.example.finance.repository.CardDetailsRepository;
import com.example.finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Service
public class CardDetailsServiceImpl implements CardDetailsService{

	@PersistenceContext
	EntityManager em;

	@Autowired
	private CardDetailsRepository cardDetailsRepository;

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;
	
//	@Override
//	public CardDetails getCardDetails(long userId) {
//		//Check if a admin is present with the provided username and password by building jpql query
//		String jpql = "select c from CardDetails c where c.reg_id=userid";
//
//		TypedQuery<CardDetails> query = em.createQuery(jpql, CardDetails.class);
//		query.setParameter("userid", userId);
//
//		CardDetails cardDetails = query.getResultList().stream().findFirst().orElse(null);
//
//		return cardDetails;
//	}

	@Override
	public CardDetails saveInitialCardDetails(long userId) {
		User user = userService.getUserById(userId);
		CardDetails cardDetails = new CardDetails();
		 cardDetails.setUser(user);
		 cardDetails.setCard_type(user.getCardType());
		 cardDetails.setValidity("Jan-2030");
		 if(user.getCardType().equalsIgnoreCase("gold")){
			 cardDetails.setCard_limit(100000);
			 cardDetails.setBalance(100000);
		 }else{
		 	 cardDetails.setCard_limit(200000);
			 cardDetails.setBalance(200000);
		 }


		return cardDetailsRepository.save(cardDetails);
	}

//	@Override
//	public Integer setCardDetails(long uid) {
//		User user = userRepository.findById(uid).get();
//		String cardType = user.getCardType();
//		if(cardType.equalsIgnoreCase("gold")){
//			return cardDetailsRepository.updateCard("Gold","29-08-2024",100000,100000,uid);
//
//		}else{
//			return cardDetailsRepository.updateCard("Titanium","29-08-2026",200000,200000,uid);
//		}
//	}


//	@Override
//	public CardDetails updateBal(long reg_id, int price) {
//		// TODO Auto-generated method stub
//		
//		return ;
//	}
	
	
}
