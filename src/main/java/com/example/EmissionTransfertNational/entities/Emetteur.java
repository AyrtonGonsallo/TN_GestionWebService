package com.example.EmissionTransfertNational.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Emetteur")
@Data @NoArgsConstructor @AllArgsConstructor
public class Emetteur extends Client {
	private double limite_somme_transfert;
	private int nbr_transfert_envoyes;
	@JsonIgnoreProperties({"emetteur"})
	@OneToOne(mappedBy = "emetteur")
	@Transient
	private Transfert transfert;
	@JsonIgnoreProperties(value={"emetteur","transfert"},allowSetters=true)
	@OneToMany( targetEntity=Beneficiaire.class, mappedBy="emetteur")
	private List<Beneficiaire>beneficiaires;
}
