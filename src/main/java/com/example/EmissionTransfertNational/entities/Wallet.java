package com.example.EmissionTransfertNational.entities;


import java.util.List;

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
@Table(name="Wallet")
@Data @NoArgsConstructor @AllArgsConstructor
public class Wallet {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Transient
	private Client client;
	@Transient
	private List<CarteDeCredit> cartes;
}
