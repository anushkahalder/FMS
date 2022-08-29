
package com.example.finance.entity;

 
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data

@Table(name = "Product")


public class Product {
	
	public Product() {
		super();
	}

	public Product(int product_id, String p_name, String p_description, int price, ProdHistroy prodHistroy) {
		super();
		this.product_id = product_id;
		this.p_name = p_name;
		this.p_description = p_description;
		this.price = price;
		this.prodHistroy = prodHistroy;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_description() {
		return p_description;
	}

	public void setP_description(String p_description) {
		this.p_description = p_description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ProdHistroy getProdHistroy() {
		return prodHistroy;
	}

	public void setProdHistroy(ProdHistroy prodHistroy) {
		this.prodHistroy = prodHistroy;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	private String p_name;
	private String p_description;
	private int price;

	@OneToOne(cascade =CascadeType.ALL , mappedBy = "product")
	private ProdHistroy prodHistroy;

 
	
 

}

