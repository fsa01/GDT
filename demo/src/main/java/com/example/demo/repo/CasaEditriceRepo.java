package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.CasaEditrice;

//@RepositoryRestResource
public interface CasaEditriceRepo extends JpaRepository<CasaEditrice, Long>{

}
