package com.commerce.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class ItemInvoice implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer cantidad;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="producto_id")
	//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JsonIgnore
	private Product product;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Product getProducto() {
		return product;
	}

	public void setProducto(Product producto) {
		this.product = producto;
	}

	public Double calcularImporte() {
		return cantidad.doubleValue() * product.getPrecio();
	}
	
	private static final long serialVersionUID = 1L;

}
