package com.example.EmissionTransfertNational.entities;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Agent")
@Data @NoArgsConstructor 
public class Agent extends Client {
	private double salary;
	@ManyToOne
	@JoinColumn(name="point_de_vente_id")
	private PointDeVente pointdevente;
}
