package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "CASA_EDITRICE")
public class CasaEditrice {
	
	@Id
	private Long id;
	private String nome;

}
