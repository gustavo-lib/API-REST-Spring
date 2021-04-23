package com.commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.commerce.entity.Invoice;
import com.commerce.service.ServiceInvoice;


@RestController
@RequestMapping("/api/invoice")
public class ControllerInvoice {
	
	@Autowired
	ServiceInvoice serviceInvoice;
	
	@GetMapping("")
	public ResponseEntity<?> obtenerFacturas() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(serviceInvoice.findAll());
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Invoice> obtenerUnaFactura(@PathVariable Long id) {
							
			try {
				Invoice invoice;
				invoice = serviceInvoice.findOne(id);
				System.out.println("########### "+invoice.toString());
				return ResponseEntity.status(HttpStatus.OK).body(invoice);
			} catch (Exception e) {
				// TODO: handle exception
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
	}

}
