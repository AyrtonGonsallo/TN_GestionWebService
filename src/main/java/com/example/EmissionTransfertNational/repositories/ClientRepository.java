package com.example.EmissionTransfertNational.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmissionTransfertNational.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
