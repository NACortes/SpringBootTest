package com.example.demo.domain;

import java.util.List;

import com.example.demo.db.entity.Products;

import lombok.Data;

@Data
public class ProductsResponse {
	
	private List<Products> products;

}
