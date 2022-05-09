package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.db.repository.ProductsRepository;
import com.example.demo.domain.ProductsResponse;
import com.example.demo.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	ProductsRepository productsRepository;

	@Override
//	@Cacheable(value="testCache")
	public ProductsResponse getProducts() {
		ProductsResponse response = new ProductsResponse();
		response.setProducts(productsRepository.findAll());
		return response;
	}

}
