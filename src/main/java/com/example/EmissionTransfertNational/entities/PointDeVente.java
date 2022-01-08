package com.example.EmissionTransfertNational.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="point_de_vente")
@Data @NoArgsConstructor @AllArgsConstructor
public class PointDeVente {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private double limite_quotidienne;
	private String ville;
	private String pays;
	private double montant_disponible;
	@OneToMany
	private List<Agent> Agents;
}
