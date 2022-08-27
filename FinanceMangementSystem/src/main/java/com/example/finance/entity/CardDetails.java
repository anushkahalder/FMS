package com.example.finance.entity;

import java.io.Serializable;
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
public class CardDetails implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName = "reg_id")
	private User user;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="card_type", referencedColumnName = "card_type")
	private EmiCard cardtype;

 	private int card_number;
 	private Date validity;
 	private int init_balance;private int avail_balance;
}
