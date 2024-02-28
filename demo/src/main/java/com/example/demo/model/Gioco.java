package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "GIOCO")
public class Gioco {
	@Id
	private Long id;
	private String nome;
	private int numeroDiGiocatori;
	@ManyToOne
	private CasaEditrice casaEditrice;
}
