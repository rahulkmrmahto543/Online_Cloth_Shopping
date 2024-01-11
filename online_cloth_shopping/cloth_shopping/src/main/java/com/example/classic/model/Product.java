package com.example.classic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="product")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String productName;
	public String description;
	public String price;
	public String type;
	public String image1;
	
	
//	@JsonIgnore
//	@ManyToOne
//    @JoinColumn(name = "orderNo", nullable = false)
//    private Order order;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String productName, String description, String price, String type, String image1) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.type = type;
		this.image1 = image1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", description=" + description + ", price="
				+ price + ", type=" + type + ", image1=" + image1 + "]";
	}
	
	
}
