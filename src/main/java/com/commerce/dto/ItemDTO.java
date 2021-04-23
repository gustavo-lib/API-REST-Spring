package com.commerce.dto;



public class ItemDTO {

	private Long id;
	private Integer cantidad;
	private ProductDTO product;
	public ItemDTO() {
		super();
	}
	public ItemDTO(Long id, Integer cantidad, ProductDTO product) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.product = product;
	}
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
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", cantidad=" + cantidad + ", product=" + product + "]";
	}

	
}
