package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Gioco;
import com.example.demo.repo.GiocoRepo;

@RestController
public class Controller {
	//ricordarsi di fare il clean install e sistemare il db
	@Autowired
	private GiocoRepo repo;
	
	 @GetMapping("/")
	    public String helloWorld() {
	        return "Hello World!";
	    }
	 @PostMapping("/addgioco") // Nome più descrittivo
	    public void addCasaEditrice(@RequestBody Gioco gioco) {
	
		 repo.save(gioco);
		 
	    }
}
