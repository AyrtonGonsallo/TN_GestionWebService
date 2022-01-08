package com.example.EmissionTransfertNational.entities;

import java.util.Date;

import javax.persistence.*;

import com.example.EmissionTransfertNational.enums.TypeCompte;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
@Entity
@Table(name="Compte")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Compte {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCompte;
	private double montant;
	@ManyToOne
	@JoinColumn(name="idClient")
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@JsonIgnoreProperties("comptes")
	private Client client;
	private Date date_ouverture;
	@Enumerated(EnumType.STRING)
	private TypeCompte type;
}
