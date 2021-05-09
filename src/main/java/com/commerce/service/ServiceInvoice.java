package com.commerce.service;

import java.util.List;


import com.commerce.entity.Invoice;

public interface ServiceInvoice {
	
    public List<Invoice> findAll();
	
	public Invoice save(Invoice invoice);
	
	public Invoice findOne(Long id);
	
	public void delete(Long id);
	
	public Invoice addItemToInvoice(Long idInvoice, Long idItem, int cant);

}
