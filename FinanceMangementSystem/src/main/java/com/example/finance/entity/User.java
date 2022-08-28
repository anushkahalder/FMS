package com.example.finance.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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

	
}
