package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CasaEditrice;
import com.example.demo.repo.CasaEditriceRepo;

@RestController
public class GDTController {
	
	 	@Autowired
	    private CasaEditriceRepo repo;

	    @GetMapping("/hello")
	    public String helloWorld() {
	        return "Hello World!";
	    }

	    @PostMapping("/addCasaEditrice") // Nome più descrittivo
	    public void addCasaEditrice(@RequestBody CasaEditrice casaEditrice) { // Usa il nome completo della classe
	        repo.save(casaEditrice);
	    }
}
