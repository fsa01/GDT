package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "GIOCO")
/*trovato extends JPASupport indagare*/
public class Gioco {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int numeroDiGiocatori;
	//@ManyToOne(cascade = CascadeType.ALL)
	//private CasaEditrice casaEditrice;
}
