package com.example.SpringBootRestTemplate.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.SpringBootRestTemplate.entity.Product;

@Service
public class ProductService {
	private RestTemplate restTemplate = new RestTemplate();
	String url = "localhost:8080/api/";
	
	public List<Product> getListProducts(){
		ResponseEntity<Product[]> responseEntity = restTemplate.getForEntity(url+"get-all", Product[].class);
		return Arrays.asList(responseEntity.getBody());
	}
	public Product create(Product product) {
		return restTemplate.postForObject(url+"create", product, Product.class);
	}
}
