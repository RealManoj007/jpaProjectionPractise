package com.spring.projections.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.projections.dtoAsInterface.IBrandDTO;
import com.spring.projections.dtoAsInterface.IcategoryDTO;
import com.spring.projections.dtoasclass.ProductCategoryDTO;
import com.spring.projections.dtoasclass.ProductDetailsDTO;
import com.spring.projections.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Integer>{
	//when i give brand it will give product details
	//for that i need to use query
	//select productname, price from product where brand=?1
	// But i want limited columns info, use DTO for this
	
	
	//projections using classes
	List<ProductDetailsDTO>findByBrand(String brand);
	
	List<ProductCategoryDTO> findByCategory(String category);
	
	
	//projections using interface
	List<IBrandDTO> getByProductName(String productname);
	
	//select brand,productname from product where category =?1;
	List<IcategoryDTO> findBycategory(String categoryName);
}
