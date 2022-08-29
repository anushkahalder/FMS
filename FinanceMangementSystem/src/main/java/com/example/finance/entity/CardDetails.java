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
	@JoinColumn(name="reg_id", referencedColumnName = "reg_id")
	private User user;

	private String card_type;

	private String validity;

	private int card_limit;

	private int balance;

	
}
