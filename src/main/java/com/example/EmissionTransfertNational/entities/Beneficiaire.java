package com.example.EmissionTransfertNational.entities;


import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Beneficiaire")
@Data @NoArgsConstructor 
public class Beneficiaire extends Client {
	private int nbr_transfert_recus;
	@JsonIgnoreProperties({"beneficiaire"})
	@OneToMany( targetEntity=Transfert.class, mappedBy="emetteur")
	@Transient
	private List <Transfert> transferts;
	@JsonIgnoreProperties({"beneficiaires","transfert"})
	@ManyToOne
	@JoinColumn(name="idEmetteur")
	private Emetteur emetteur;

}
