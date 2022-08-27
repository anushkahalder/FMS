package com.example.finance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emicard")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmiCard {
	
	@Id
	private String card_type;

	private Date validity;
	private String card_limit;

	@OneToOne(cascade=CascadeType.ALL, mappedBy = "cardtype")
	private CardDetails cardDetails;
}
