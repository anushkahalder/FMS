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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardDetails{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int card_number;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName = "reg_id")
	private User user;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emicard_id", referencedColumnName = "emicard_id")
	private EmiCard cardtype;

 	
 	private String validity;
 	private int init_balance;
 	private int avail_balance;

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
	public EmiCard getCardtype() {
		return cardtype;
	}
	public void setCardtype(EmiCard cardtype) {
		this.cardtype = cardtype;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public int getInit_balance() {
		return init_balance;
	}
	public void setInit_balance(int init_balance) {
		this.init_balance = init_balance;
	}
	public int getAvail_balance() {
		return avail_balance;
	}
	public void setAvail_balance(int avail_balance) {
		this.avail_balance = avail_balance;
	}
	
}
