package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.entity.Client;

@Repository("clientRepository")
public interface IClient extends JpaRepository<Client, Long> {

}
