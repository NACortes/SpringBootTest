package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ProductsResponse;
import com.example.demo.service.ProductsService;

@RestController
public class DemoAppController {
	
	@Autowired
	ProductsService productsService;
	
	@GetMapping("/getProducts")
//	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Some parameters are invalid")
	public ProductsResponse getAllProducts() {
		return productsService.getProducts();
	}

}
