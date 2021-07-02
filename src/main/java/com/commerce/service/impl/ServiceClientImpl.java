package com.commerce.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commerce.convert.ClientMapper;
import com.commerce.dto.ClientDTO;
import com.commerce.entity.Client;
import com.commerce.repository.IClient;
import com.commerce.service.ServiceClient;


@Service("clientImpl")
public class ServiceClientImpl implements ServiceClient  {

	@Autowired
	IClient respositoryClient;
	
	@Autowired
	ClientMapper clientMapper;
	
	@Override
	public List<ClientDTO> findAll() {
		// TODO Auto-generated method stub respositoryClient.findAll();
		return clientMapper.toDtoList(respositoryClient.findAll());
		
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
