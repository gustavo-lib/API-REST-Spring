package com.commerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeforgeyt.onetomanywebservice.model.Cart;
import com.codeforgeyt.onetomanywebservice.model.dto.CartDto;
import com.commerce.entity.Client;
import com.commerce.entity.Invoice;
import com.commerce.service.ServiceClient;
import com.commerce.service.ServiceInvoice;


@RestController
@RequestMapping("/api/invoice")
public class ControllerInvoice {
	
	@Autowired
	ServiceInvoice serviceInvoice;
	
	@Autowired
	ServiceClient serviceClient;
	
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
				return ResponseEntity.status(HttpStatus.OK).body(invoice);
			} catch (Exception e) {
				// TODO: handle exception
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
	}
	
	@PostMapping("/save/{id}")
	public ResponseEntity<Invoice> guardarFactura(@RequestBody @Valid Invoice invoice, @PathVariable final Long id){
		try {
			Client c= serviceClient.findOne(id);
			invoice.setClient(c);
			return ResponseEntity.status(HttpStatus.OK).body(serviceInvoice.save(invoice));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

	/*@PostMapping("/save")
	public ResponseEntity<Invoice> guardarFactura(@RequestBody @Valid Invoice invoice){
		try {
			//Client c= new Client();
			//Long id=new Long(27);//id cliente que existe
			//c.setId(id);
			//invoice.setClient(c);
			return ResponseEntity.status(HttpStatus.OK).body(serviceInvoice.save(invoice));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}*/
	
	 @PostMapping(value = "{invoiceId}/items/{itemId}/add")
	    public ResponseEntity<Invoice> addItemToCart(@PathVariable final Long invoiceId,
	                                                 @PathVariable final Long itemId){
	        Cart cart = cartService.addItemToCart(cartId, itemId);
	        return new ResponseEntity<>(CartDto.from(cart), HttpStatus.OK);
	    }
}
