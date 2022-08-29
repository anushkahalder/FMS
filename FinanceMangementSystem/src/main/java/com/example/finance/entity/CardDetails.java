package com.example.finance.entity;

import java.sql.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
public class CardDetails{
	public CardDetails() {
		super();
	}

	public CardDetails(int card_number, User user, String card_type, String validity, int card_limit, int balance) {
		super();
		this.card_number = card_number;
		this.user = user;
		this.card_type = card_type;
		this.validity = validity;
		this.card_limit = card_limit;
		this.balance = balance;
	}

	public int getCard_number() {
		return card_number;
	}

	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public int getCard_limit() {
		return card_limit;
	}

	public void setCard_limit(int card_limit) {
		this.card_limit = card_limit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int card_number;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="reg_id", referencedColumnName = "reg_id")
	private User user;

	private String card_type;

	private String validity;

	private int card_limit;

	private int balance;

	
}
