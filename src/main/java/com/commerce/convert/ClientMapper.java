package com.commerce.convert;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.commerce.dto.ClientDTO;
import com.commerce.entity.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {

	@Mappings({ 
		@Mapping(source = "id", target = "id"), 
	@Mapping(source = "nombre", target = "nombre"),
	@Mapping(source = "apellido", target = "apellido"),
	@Mapping(source = "email", target = "email"),
	@Mapping(source = "createAt", target = "createAt"), 
	})
	List<ClientDTO> toDtoList(List<Client> clientes);

	
	
}
