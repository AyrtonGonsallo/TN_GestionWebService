package com.example.EmissionTransfertNational.entities;


import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Wallet")
@Data @NoArgsConstructor @AllArgsConstructor
public class Wallet {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToOne(mappedBy="wallet")
	private Client client;
	@OneToMany(targetEntity=CarteDeCredit.class,mappedBy="wallet")
	private List<CarteDeCredit> cartes;
}
