package com.example.EmissionTransfertNational.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Carte_de_credit")
@Data @NoArgsConstructor @AllArgsConstructor
public class CarteDeCredit {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Transient
	private Client client;
	private double montant;
	private Date date_expiration;
}
