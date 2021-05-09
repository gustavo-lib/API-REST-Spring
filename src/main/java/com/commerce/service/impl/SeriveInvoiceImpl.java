package com.commerce.service.impl;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.commerce.entity.Invoice;
import com.commerce.entity.ItemInvoice;
import com.commerce.entity.Product;
import com.commerce.repository.IInvoice;
import com.commerce.repository.IProduct;
import com.commerce.service.ServiceInvoice;
import com.commerce.service.ServiceItem;

@Service
public class SeriveInvoiceImpl implements ServiceInvoice{

	@Autowired
	IInvoice respositoryInvoice;
	
	@Autowired
	IProduct repositoryProducto;
	
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
	public Invoice addItemToInvoice(Long idInvoice, Long idItem, int cant) {
		// TODO Auto-generated method stub
		Invoice i= respositoryInvoice.getOne(idInvoice);
		//debo encontrar el producto
		Product producto=repositoryProducto.getOne(idItem);
		ItemInvoice item= new ItemInvoice();
		item.setProducto(producto);
		item.setCantidad(cant);
		i.addItemInvoice(item);
		return i;
	}

	

}
