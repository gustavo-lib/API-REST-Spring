package com.commerce.service;

import java.util.List;

import com.commerce.entity.Client;

public interface ServiceItem {
	
    public List<Client> findAll();
		
	public void save(Client cliente);
	
	public Client findOne(Long id);
	
	public void delete(Long id);

}
