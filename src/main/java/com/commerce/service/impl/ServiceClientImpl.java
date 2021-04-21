package com.commerce.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public void save(Client cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
