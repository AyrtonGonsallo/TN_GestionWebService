package com.example.EmissionTransfertNational.entities;


import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Beneficiaire")
@Data @NoArgsConstructor 
public class Beneficiaire extends Client {
	private int nbr_transfert_recus;

}
