package com.commerce.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commerce.entity.Client;
import com.commerce.repository.IClient;
import com.commerce.service.ServiceClient;


@Service("clientImpl")
public class ServiceClientImpl implements ServiceClient  {

	@Autowired
	IClient respositoryClient;
	
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return respositoryClient.findAll();
		
	}

	@Override
	public Client save(Client cliente) {
		// TODO Auto-generated method stub
		return respositoryClient.save(cliente);
	}

	@Override
	public Client findOne(Long id) {
		return respositoryClient.getOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		respositoryClient.deleteById(id);
	}

	@Override
	public Client update(Long id, Client cliente) {
		// TODO Auto-generated method stub
		return respositoryClient.save(cliente);
	}

}
