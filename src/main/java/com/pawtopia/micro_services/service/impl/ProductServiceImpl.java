package com.pawtopia.micro_services.service.impl;

import java.util.List;

import com.pawtopia.micro_services.entity.ProductEntity;
import com.pawtopia.micro_services.repository.ProductRepository;
import com.pawtopia.micro_services.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  private ProductRepository productRepository;

  @Override
  public ProductEntity createProduct(ProductEntity productEntity) {
    return productRepository.createProduct(productEntity);
  }

  @Override
  public List<ProductEntity> findAllProducts() {
    return productRepository.findAllProducts();
  }
}
