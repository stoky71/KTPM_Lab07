package com.example.SpringBootRestTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRestTemplate.entity.Product;
import com.example.SpringBootRestTemplate.service.ProductService;

@RestController
@RequestMapping("api/")
public class ProductController {
	@Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity createOrder(@RequestBody Product product) {
        return ResponseEntity.ok(productService.create(product));
    }

    @GetMapping("get-list")
    public ResponseEntity getListOrder() {
        return ResponseEntity.ok(productService.getListProducts());
    }
}
