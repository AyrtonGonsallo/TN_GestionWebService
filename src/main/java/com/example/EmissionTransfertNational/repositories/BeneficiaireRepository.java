package com.example.EmissionTransfertNational.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmissionTransfertNational.entities.Beneficiaire;
import com.example.EmissionTransfertNational.entities.Client;

public interface BeneficiaireRepository extends JpaRepository<Beneficiaire, Long> {
	Beneficiaire findByIdClient(long id);
}
