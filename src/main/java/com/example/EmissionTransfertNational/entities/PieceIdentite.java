package com.example.EmissionTransfertNational.entities;

import java.util.Date;

import javax.persistence.*;


import com.example.EmissionTransfertNational.enums.TypePieceIdentite;

import lombok.*;
@Entity
@Table(name="Piece_Identite")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class PieceIdentite {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Enumerated(EnumType.STRING)
	private TypePieceIdentite type_piece_identite;
	private String numero;
	private Date date_de_naissance;
	private String pays;
	 @OneToOne(mappedBy = "piece_identite")
	private Client client;
	private Date date_d_expiration;
}
