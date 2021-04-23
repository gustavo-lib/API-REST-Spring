package com.commerce.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commerce.entity.Invoice;
import com.commerce.repository.IInvoice;
import com.commerce.service.ServiceInvoice;

@Service
public class SeriveInvoiceImpl implements ServiceInvoice{

	@Autowired
	IInvoice respositoryInvoice;
	
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

	

}
