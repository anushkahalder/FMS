package com.example.finance.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="userDetails")
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long reg_id;

	private String user_name;

	private long ph_number;

	private String email;

	private String user_password;

	private String user_confirm_password;

	private String address;

	private String cardType;

	private String bankName;

	private String accNumber;

	private String ifscCode;

	private String isVerified="False";
	
	/*
	public long getReg_id() {
		return reg_id;
	}

	public void setReg_id(long reg_id) {
		this.reg_id = reg_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public long getPh_number() {
		return ph_number;
	}

	public void setPh_number(long ph_number) {
		this.ph_number = ph_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_confirm_password() {
		return user_confirm_password;
	}

	public void setUser_confirm_password(String user_confirm_password) {
		this.user_confirm_password = user_confirm_password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public CardDetails getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}

	public String getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}


	@OneToOne(
			cascade = CascadeType.ALL,
			mappedBy = "user"
	)
	private CardDetails cardDetails;
*/
	
}
