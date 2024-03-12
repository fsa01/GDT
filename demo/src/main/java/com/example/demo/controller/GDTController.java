package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CasaEditrice;
import com.example.demo.repo.CasaEditriceRepo;
//import com.example.demo.service.ServiceGDT;

@RestController
public class GDTController {
	//capire  se mettere le case editrici in cache prima di aggiungere un nuovo gioco

//	 	@Autowired
//	 	private final ServiceGDT serviceGDT;
	 	@Autowired
	 	CasaEditriceRepo repo;
	 	
	 	@GetMapping("/hello")
	    public String helloWorld() {
	        return "Hello World!";
	    }

	    @PostMapping("/addCasaEditrice") // Nome più descrittivo
	    public void addCasaEditrice(@RequestBody CasaEditrice test) { // Usa il nome completo della classe
	    	//serviceGDT.createCasaEditrice(test);
	    	//return null;
	    	//return test.getNome();
	    	repo.save(test);
	    }
	    
//	    @GetMapping("/getAllCasaEditrice")
//	    public List<CasaEditrice> getall() {
//	    	List<CasaEditrice> a=repo.findAll();
//	    	System.out.println(a.toString());
//	    	return a;
//	    }
	   //aggiungere il post per aggiungere il gioco e testare se a cascada posso inserire il gioco e la casa editrice 
//	    @PostMapping("/addGioco") // Nome più descrittivo
//	    public void addgioco(@RequestBody Gioco gioco) { // Usa il nome completo della classe
//	        rep.save(gioco);
//	    	
//	    }

}
