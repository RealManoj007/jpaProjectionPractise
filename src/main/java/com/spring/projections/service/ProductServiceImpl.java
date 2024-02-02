package com.spring.projections.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.projections.dtoAsInterface.IBrandDTO;
import com.spring.projections.dtoAsInterface.IcategoryDTO;
import com.spring.projections.dtoasclass.ProductCategoryDTO;
import com.spring.projections.dtoasclass.ProductDetailsDTO;
import com.spring.projections.repository.IProductRepository;

@Service
public class ProductServiceImpl implements  IProductService{
	
	@Autowired
	IProductRepository productRepository; 
	
	public void setProductRepository(IProductRepository productRepository) {
		this.productRepository=productRepository;
	}

	@Override
	public List<ProductDetailsDTO> getByBrand(String brand) {
		List<ProductDetailsDTO> byBrand = productRepository.findByBrand(brand);
		System.err.println(byBrand.stream().count());
		System.err.println("Brand is "+byBrand+" \n");
		return byBrand;
	}

	@Override
	public List<ProductCategoryDTO> getByCategory(String category) {
		System.out.println("Category nmae is "+category);
		return productRepository.findByCategory(category);
	}

	@Override
	public List<IBrandDTO> getByProductName(String productname) {
		System.out.println("Product name is "+productname);
		List<IBrandDTO> byProductName = productRepository.getByProductName(productname);
		System.out.println(byProductName);
		return byProductName;
	}

	@Override
	public List<IcategoryDTO> datagetBycategory(String categoryName) {
		List<IcategoryDTO> findBycategory = productRepository.findBycategory(categoryName);
		System.out.println(findBycategory);
		return findBycategory;
	}
}
