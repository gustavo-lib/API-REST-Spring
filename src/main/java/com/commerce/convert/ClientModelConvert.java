package com.commerce.convert;

import com.commerce.dto.ClientDTO;
import com.commerce.entity.Client;

public class ClientModelConvert {
	
	public ClientDTO ConvertE2Dto(Client client) {
		ClientDTO clientDto=new ClientDTO();
		clientDto.setNombre(client.getNombre());
		clientDto.setApellido(client.getApellido());
		clientDto.setCreateAt(client.getCreateAt());
		clientDto.setId(client.getId());
		clientDto.setEmail(client.getEmail());
		return clientDto;
	}
	
	public Client convertDto2Entity(ClientDTO cliente) {
		Client client=new Client();
		client.setNombre(cliente.getNombre());
		client.setApellido(cliente.getApellido());
		client.setEmail(cliente.getEmail());
		return client;
	}

}
