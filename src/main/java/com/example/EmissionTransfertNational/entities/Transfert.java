package com.example.EmissionTransfertNational.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.example.EmissionTransfertNational.enums.EtatTransfert;
import com.example.EmissionTransfertNational.enums.MotifTransfert;
import com.example.EmissionTransfertNational.enums.TypeTransfert;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Transfert")
@Data @NoArgsConstructor @AllArgsConstructor
public class Transfert {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String reference;
	private String codePin;
	@Enumerated(EnumType.STRING)
	private TypeTransfert type;
	@Enumerated(EnumType.STRING)
	private EtatTransfert etat;
	private Date delai_de_validite;
	private Date delai_de_desherence;
	private Date date_demission;
	private Date date_de_blocage;
	private Date date_de_deblocage;
	private double montant_transfert;
	private double montant_operation;
	private double comission;
	private double frais;
	@Transient
	private Emetteur emetteur;
	private String pays_d_emission;
	@Transient
	private Beneficiaire beneficiaire;
	@Enumerated(EnumType.STRING)
	private MotifTransfert motif;
}
