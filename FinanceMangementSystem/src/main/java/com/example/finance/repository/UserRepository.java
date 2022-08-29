package com.example.finance.repository;

import javax.transaction.Transactional;

import com.example.finance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	 @Transactional
	 @Modifying
	 @Query("select u.card_type from User u where u.reg_id=reg_id")
	 User getCardDetails();
}
