package com.commerce.dto;


import java.util.Date;
import java.util.List;

import com.commerce.entity.Client;
import com.commerce.entity.ItemInvoice;

public class InvoiceDTO {

	private Long id;
	private String descripcion;
	private String observacion;
	private Date createAt;
	private Client client;
	private List<ItemInvoice> items;
	
	public InvoiceDTO() {
		super();
	}
	
	public InvoiceDTO(Long id, String descripcion, String observacion, Date createAt, Client client,
			List<ItemInvoice> items) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.observacion = observacion;
		this.createAt = createAt;
		this.client = client;
		this.items = items;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<ItemInvoice> getItems() {
		return items;
	}
	public void setItems(List<ItemInvoice> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "InvoiceDTO [id=" + id + ", descripcion=" + descripcion + ", observacion=" + observacion + ", createAt="
				+ createAt + ", client=" + client + ", items=" + items + "]";
	}

	
	
	
}
