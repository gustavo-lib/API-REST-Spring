package com.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<?> obtenerEmpleados(){
	try {
			return ResponseEntity.status(HttpStatus.OK).body(serviceClient.findAll());
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		
		 
	}
	

}
