package com.spring.projections.service;

import java.util.List;

import com.spring.projections.dtoAsInterface.IBrandDTO;
import com.spring.projections.dtoAsInterface.IcategoryDTO;
import com.spring.projections.dtoasclass.ProductCategoryDTO;
import com.spring.projections.dtoasclass.ProductDetailsDTO;

public interface IProductService {

	//projections using DTO class
	List<ProductDetailsDTO> getByBrand(String brand);
	
	//project for Category
	List<ProductCategoryDTO> getByCategory(String category);
	
	List<IBrandDTO> getByProductName(String productname);
	
	List<IcategoryDTO> datagetBycategory(String categoryName);
}
