package com.example.EmissionTransfertNational.repositories;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import com.example.EmissionTransfertNational.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
	@Query("select c from Client c where c.idClient=:idclient")
	Client findWithIdClient(@Param("idclient")long id);
	
	Client findByIdClient(long id);
}
