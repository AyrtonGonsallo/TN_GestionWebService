package com.example.EmissionTransfertNational.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Agent")
@Data @NoArgsConstructor 
public class Agent extends Client {
	private double salary;
}
