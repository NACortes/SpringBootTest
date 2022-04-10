package com.example.demo.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.db.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, String> {
	// For reference for NamedQueries
	// https://www.baeldung.com/spring-jpa-like-queries

	List<Products> getProductsByProductName(String productName);
}
