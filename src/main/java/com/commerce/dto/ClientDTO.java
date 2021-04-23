package com.commerce.dto;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import com.commerce.dto.InvoiceDTO;


public class ClientDTO {
	
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createAt;
	private List<InvoiceDTO> invoiceDTO;
	
	public ClientDTO() {
		super();
	}
	public ClientDTO(Long id, String nombre, String apellido, String email, Date createAt, List<InvoiceDTO> invoiceDTO) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.createAt = createAt;
		this.invoiceDTO = invoiceDTO;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getCreateAt() {
		return createAt;
	}
	
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	public List<InvoiceDTO> getInvoiceDTOs() {
		return invoiceDTO;
	}
	
	public void setInvoiceDTOs(List<InvoiceDTO> InvoiceDTOs) {
		this.invoiceDTO = InvoiceDTOs;
	}
	
	
	
}
