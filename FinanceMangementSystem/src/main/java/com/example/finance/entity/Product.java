
package com.example.finance.entity;

 
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
@Table(name = "Product")


public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	private String p_name;
	private String p_description;
	private int price;

	@OneToOne(cascade =CascadeType.ALL , mappedBy = "product")
	private ProdHistroy prodHistroy;

 
	
 

}

