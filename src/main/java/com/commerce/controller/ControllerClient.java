package com.commerce.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.entity.Client;
import com.commerce.service.ServiceClient;

@RestController
@RequestMapping("/api/cliente")
public class ControllerClient {

	@Autowired
	ServiceClient serviceClient;

	@GetMapping("")
	public ResponseEntity<?> obtenerEmpleados() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(serviceClient.findAll());
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Client> obtenerEmpleado(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(serviceClient.findOne(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Client> modificarEmpleado(@RequestBody @Valid Client c, @PathVariable Long id ){
		Client cliente= serviceClient.findOne(id);
	    if(cliente !=null) {
	    	cliente.setNombre(c.getNombre());
	    	cliente.setApellido(c.getApellido());
	    	cliente.setEmail(c.getEmail());
	    	//cliente.setCreateAt(new Date());
	    	return ResponseEntity.status(HttpStatus.OK).body(serviceClient.save(cliente));
	    }
	    else {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	    }		
	} 
	
	@PostMapping("/guardar")
	public ResponseEntity<Client> guardarEmpleado(@RequestBody @Valid Client c){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(serviceClient.save(c));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	} 
		
}
