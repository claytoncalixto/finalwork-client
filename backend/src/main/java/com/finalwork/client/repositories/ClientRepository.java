package com.finalwork.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalwork.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	
}