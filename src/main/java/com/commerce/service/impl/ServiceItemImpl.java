package com.commerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commerce.entity.ItemInvoice;
import com.commerce.repository.IItems;
import com.commerce.service.ServiceItem;

@Service("itemImpl")
public class ServiceItemImpl implements ServiceItem{

	@Autowired
	IItems respositoryItem;
	
	@Override
	public List<ItemInvoice> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ItemInvoice item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemInvoice findOne(Long id) {
		// TODO Auto-generated method stub
		return respositoryItem.getOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
