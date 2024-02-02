package com.spring.projections.dtoasclass;


//shoiuld have properties that point to column in DB
//should have the same instance variable like in domain model
//should have only parametrized constructor for these instance variables
//should have only getter methods for these instance variables
public class ProductDetailsDTO {
	
	private String productName;
	private Double price;
	
	public ProductDetailsDTO(String productName, Double price) {
		this.productName = productName;
		this.price = price;
	}

	public  String getProductName() {
		return productName;
	}

	public  Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ProductDetailsDTO [productName=" + productName + ", price=" + price + "]";
	}
	
}
