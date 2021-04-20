package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.entity.Product;

public interface IProduct extends JpaRepository<Product, Long> {

}
