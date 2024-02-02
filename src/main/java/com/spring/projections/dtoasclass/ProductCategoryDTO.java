package com.spring.projections.dtoasclass;

public class ProductCategoryDTO {
	
	private String brand;
	private String category;
	
	public ProductCategoryDTO(String brand, String category) {
		this.brand = brand;
		this.category = category;
	}
	public synchronized String getBrand() {
		return brand;
	}
	public synchronized void setBrand(String brand) {
		this.brand = brand;
	}
	public synchronized String getCategory() {
		return category;
	}
	public synchronized void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "ProductBrandDTO [brand=" + brand + ", category=" + category + "]";
	}
}
