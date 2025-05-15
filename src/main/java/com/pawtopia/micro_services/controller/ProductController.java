package com.pawtopia.micro_services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawtopia.micro_services.entity.ProductEntity;
import com.pawtopia.micro_services.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping("")
  public ProductEntity createProduct(@RequestBody ProductEntity productEntity) {
    return productService.createProduct(productEntity);
  }

  @GetMapping("")
  public List<ProductEntity> findAllProducts() {
    return productService.findAllProducts();
  }
}
