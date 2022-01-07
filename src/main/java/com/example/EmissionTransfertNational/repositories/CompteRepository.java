package com.example.EmissionTransfertNational.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmissionTransfertNational.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
