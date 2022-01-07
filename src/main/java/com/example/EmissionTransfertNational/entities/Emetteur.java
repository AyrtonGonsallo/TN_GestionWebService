package com.example.EmissionTransfertNational.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Emetteur")
@Data @NoArgsConstructor @AllArgsConstructor
public class Emetteur extends Client {
	private double limite_somme_transfert;
	private int nbr_transfert_envoyes;
}
