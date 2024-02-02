package com.spring.projections;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.projections.dtoAsInterface.IBrandDTO;
import com.spring.projections.entity.Product;
import com.spring.projections.repository.IProductRepository;
import com.spring.projections.service.IProductService;

@SpringBootApplication
public class SpringProjectionsApplication implements CommandLineRunner{
	
	@Autowired
	private IProductRepository productRepository;
	
	@Autowired
	private IProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product=new Product("Diaper",120.00,"poco","baby");
		Product product1=new Product("Mobile",15000.00,"poco","mobile");
		Product product2=new Product("Cleaner",34120.00,"poco","household");
		Product product3=new Product("headphone",120.00,"poco","adult");
		Product product4=new Product("Note 13 pro",120.00,"MI","mobile");
				
		productRepository.save(product);
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		
		System.err.println("===========================================");
		
		productService.getByBrand("poco")
			.forEach(productDetails->{
				System.out.println(
						productDetails.getProductName()+" : "+
						productDetails.getPrice());
			});
		
		List<String> categoryList = productService.getByCategory("mobile")
				.stream()
				.map(e->e.getCategory()+" : "+e.getBrand())
				.collect(Collectors.toList());
		
		System.out.println(categoryList);
		
		 List<IBrandDTO> dto =productService.getByProductName("Diaper");
		 List<String> list = dto.stream().map(val->val.getBrand()+" : "+val.getCategory()).collect(Collectors.toList());
//		System.out.println("brnad is "+dto.getBrand()+" : category is "+dto.getCategory());
		 System.out.println("values list is \n"+list);
		 
		 
		 List<String> categoryMapped = productService.datagetBycategory("mobile")
		 				.stream()
		 				.map(category->category.getProductName()+" : "+category.getBrand())
		 				.collect(Collectors.toList());
		 
		 System.err.println("Values are "+categoryMapped);
	}

}
