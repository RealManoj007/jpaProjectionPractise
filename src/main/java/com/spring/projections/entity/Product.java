package com.spring.projections.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productid")
	private Integer productId;
	@Column(name="productname")
	private String productName;
	private Double price;
	private String brand;
	private String category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String productName, Double price, String brand, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.brand = brand;
		this.category = category;
	}
	
	public Product(String productName, Double price, String brand, String category) {
		this.productName = productName;
		this.price = price;
		this.brand = brand;
		this.category = category;
	}
	
	public  Integer getProductId() {
		return productId;
	}
	public  void setProductId(Integer productId) {
		this.productId = productId;
	}
	public  String getProductName() {
		return productName;
	}
	public  void setProductName(String productName) {
		this.productName = productName;
	}
	public  Double getPrice() {
		return price;
	}
	public  void setPrice(Double price) {
		this.price = price;
	}
	public  String getBrand() {
		return brand;
	}
	public  void setBrand(String brand) {
		this.brand = brand;
	}
	public  String getCategory() {
		return category;
	}
	public  void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + productName + ", price=" + price + ", brand="
				+ brand + ", category=" + category + "]";
	}
	
}
