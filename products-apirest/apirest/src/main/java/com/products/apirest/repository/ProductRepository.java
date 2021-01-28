package com.products.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.apirest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	//vamos criar um método no qual ele vai procurar um único produto através do id
	Product findById(long id);
	
}
