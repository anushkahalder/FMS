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
	private long regId;
	private String userName;
	private long phNumber;
	private String email;
	private String userPassword;
	private String address;
	private String cardType;
	private String bankName;
	private String accNumber;
	private String ifscCode;
	private String isVerified="False";
	private Date appliedOn=Date.valueOf(LocalDate.now());

	@OneToOne(
			cascade = CascadeType.ALL,
			mappedBy = "user"
	)
	private CardDetails cardDetails;
	
	
}
