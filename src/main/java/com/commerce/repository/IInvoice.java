package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.entity.Invoice;

public interface IInvoice extends JpaRepository<Invoice, Long> {

}
