package com.example.EmissionTransfertNational.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Gichet_a_billet")
@Data @NoArgsConstructor @AllArgsConstructor
public class GichetABillet {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	//private double limite_quotidienne;
	private String ville;
	private String pays;
	private double montant_disponible;
}
