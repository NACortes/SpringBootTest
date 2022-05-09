package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ProductsResponse;
import com.example.demo.service.ProductsService;
import com.example.demo.validation.ValidationTestClass;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoAppController {
	
	@Autowired
	ProductsService productsService;
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/getProducts")
//	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Some parameters are invalid")
	public ProductsResponse getAllProducts() {
		return productsService.getProducts();
	}
	
	
	@PostMapping("/validateFields")
	public ResponseEntity<String> validateFields(@Valid @RequestBody ValidationTestClass request){
		
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Validator validator = factory.getValidator();
//		
//		Set<ConstraintViolation<ValidationTestClass>> violations = validator.validate(request);
//		
//		List<String> errors = new ArrayList<>();
//		for (ConstraintViolation<ValidationTestClass> violation : violations) {
//		    log.error(violation.getMessage());
//		    log.error(violation.getPropertyPath().toString());
//		    log.error(violation.getInvalidValue().toString());
//		    errors.add(String.format("", null));
//		    
//		}
		
		return new ResponseEntity<>("",HttpStatus.OK);
	}
	
	

}
