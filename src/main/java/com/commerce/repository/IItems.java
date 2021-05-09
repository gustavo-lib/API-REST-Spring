package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.entity.ItemInvoice;

@Repository
public interface IItems extends JpaRepository<ItemInvoice, Long> {

}
