package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table( name = "CASA_EDITRICE")
@Getter
@Setter
@AllArgsConstructor
public class CasaEditrice {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    @Column(name="nome")
	private String nome;

}
