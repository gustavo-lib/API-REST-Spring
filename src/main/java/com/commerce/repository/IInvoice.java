package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.entity.Invoice;

@Repository("invoiceRepository")
public interface IInvoice extends JpaRepository<Invoice, Long> {

}
