package com.example.EmissionTransfertNational.entities;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Beneficiaire")
@Data @NoArgsConstructor 
public class Beneficiaire extends Client {
	private int nbr_transfert_recus;
	@JsonIgnoreProperties({"beneficiaire"})
	@OneToOne(mappedBy = "beneficiaire")
	@Transient
	private Transfert transfert;
	@JsonIgnoreProperties({"beneficiaires","transfert"})
	@ManyToOne
	@JoinColumn(name="idEmetteur")
	private Emetteur emetteur;

}
