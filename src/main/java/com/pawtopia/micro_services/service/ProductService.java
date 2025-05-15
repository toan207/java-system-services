package com.pawtopia.micro_services.service;

import java.util.List;

import com.pawtopia.micro_services.entity.ProductEntity;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {
  ProductEntity createProduct(ProductEntity productEntity);

  List<ProductEntity> findAllProducts();
}
