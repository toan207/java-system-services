package com.pawtopia.micro_services.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.pawtopia.micro_services.entity.ProductEntity;
import com.pawtopia.micro_services.repository.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
  @Override
  public ProductEntity createProduct(ProductEntity productEntity) {
    ProductEntity product = new ProductEntity();
    product.setName(productEntity.getName());
    product.setDescription(productEntity.getDescription());
    product.setPrice(productEntity.getPrice());
    return product;
  }

  @Override
  public List<ProductEntity> findAllProducts() {
    List<ProductEntity> products = new ArrayList<>();
    products.add(new ProductEntity(1L, "Product 1", "Description 1", new BigDecimal(100)));
    return products;
  }
}