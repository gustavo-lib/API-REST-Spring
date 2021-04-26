package com.commerce.service.impl;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeforgeyt.onetomanywebservice.model.exception.ItemIsAlreadyAssignedException;
import com.commerce.entity.Invoice;
import com.commerce.entity.ItemInvoice;
import com.commerce.repository.IInvoice;
import com.commerce.service.ServiceInvoice;
import com.commerce.service.ServiceItem;

@Service
public class SeriveInvoiceImpl implements ServiceInvoice{

	@Autowired
	IInvoice respositoryInvoice;
	
	@Autowired
	ServiceItem serviceItem;
	
	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return respositoryInvoice.findAll();
	}

	@Override
	public Invoice save(Invoice invoice) {
		// TODO Auto-generated method stub
		return respositoryInvoice.save(invoice);
	}

	@Override
	public Invoice findOne(Long id) {
		// TODO Auto-generated method stub
		return respositoryInvoice.getOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Invoice addItemToInvoice(Long idInvoice, Long idItem) {
		// TODO Auto-generated method stub
		Invoice i= findOne(idInvoice);
		ItemInvoice item=serviceItem.findOne(idItem);
		
        item.addItem(item);
        item.setCart(cart);
        return cart;
		return null;
	}

	

}
