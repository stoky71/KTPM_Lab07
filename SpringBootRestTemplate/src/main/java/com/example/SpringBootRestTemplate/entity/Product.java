package com.example.SpringBootRestTemplate.entity;

import lombok.Data;

@Data
public class Product {
	private Long productId;
	private String name;
	private Double price;
}
