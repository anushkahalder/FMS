package com.example.finance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emicard_id;
	private String card_type;

	private String validity;
	private Long card_limit;

	
	
	public int getEmicard_id() {
		return emicard_id;
	}

	public void setEmicard_id(int emicard_id) {
		this.emicard_id = emicard_id;
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

	public Long getCard_limit() {
		return card_limit;
	}

	public void setCard_limit(Long card_limit) {
		this.card_limit = card_limit;
	}

	

	
}
