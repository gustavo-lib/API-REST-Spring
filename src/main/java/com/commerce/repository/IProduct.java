package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.entity.Product;

@Repository("productRepository")
public interface IProduct extends JpaRepository<Product, Long> {

}
