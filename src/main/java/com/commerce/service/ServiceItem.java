package com.commerce.service;

import java.util.List;

import com.commerce.entity.ItemInvoice;

public interface ServiceItem {
	
    public List<ItemInvoice> findAll();
		
	public void save(ItemInvoice item);
	
	public ItemInvoice findOne(Long id);
	
	public void delete(Long id);

}
