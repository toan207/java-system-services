package com.pawtopia.micro_services.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pawtopia.micro_services.entity.ProductEntity;

@Repository
public interface ProductRepository {
  ProductEntity createProduct(ProductEntity productEntity);

  List<ProductEntity> findAllProducts();
}