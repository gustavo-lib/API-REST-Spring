package com.commerce.service;

import java.util.List;


import com.commerce.entity.Product;

public interface ServiceProduct {
	
    public List<Product> findAll();
	
	public void save(Product cliente);
	
	public Product findOne(Long id);
	
	public void delete(Long id);

}
