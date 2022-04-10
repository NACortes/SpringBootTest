package com.example.demo.db.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Products implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5133338682946523755L;
	
	
	@Id
	private String productCode;
	private String productName;
	private String productLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private Integer quantityInStock;
	private Double buyPrice;
	private Double MSRP;

}
