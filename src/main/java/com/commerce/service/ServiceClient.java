package com.commerce.service;

import java.util.List;

import com.commerce.dto.ClientDTO;
import com.commerce.entity.Client;

public interface ServiceClient {
	
	public List<ClientDTO> findAll();
	
	public Client save(Client cliente);
	
	public Client update(Long id, Client cliente);
	
	public Client findOne(Long id);
	
	public void delete(Long id);

}
