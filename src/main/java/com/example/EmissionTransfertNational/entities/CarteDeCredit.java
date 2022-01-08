package com.example.EmissionTransfertNational.entities;

import java.util.Date;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Carte_de_credit")
@Data @NoArgsConstructor @AllArgsConstructor
public class CarteDeCredit {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="wallet_id")
	private Wallet wallet;
	private double montant;
	private Date date_expiration;
}
