package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.entity.Client;

public interface IClient extends JpaRepository<Client, Long> {

}
