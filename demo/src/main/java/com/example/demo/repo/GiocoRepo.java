package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Gioco;

@Repository
public interface GiocoRepo extends JpaRepository<Gioco, Long>{

}
