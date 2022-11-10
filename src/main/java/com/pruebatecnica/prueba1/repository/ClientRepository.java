package com.pruebatecnica.prueba1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.prueba1.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
