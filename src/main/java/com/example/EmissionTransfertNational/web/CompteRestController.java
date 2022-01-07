package com.example.EmissionTransfertNational.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmissionTransfertNational.entities.Compte;
import com.example.EmissionTransfertNational.repositories.CompteRepository;
@RestController
public class CompteRestController {
	private CompteRepository CompteR;
	public CompteRestController(CompteRepository cR){
			this.CompteR=cR;
	}
	@GetMapping(path="/get_Comptes")
	public List<Compte>listComptes(){
		return CompteR.findAll();
		
	}
	@GetMapping(path="/get_Compte/{id}")
	public Compte getCompte(@PathVariable Long id){
		return CompteR.findById(id).get();
		
	}
	@PostMapping(path="/add_Compte")
	public Compte saveCompte(@RequestBody Compte Compte){
		
		return CompteR.save(Compte);
		
	}
	@PutMapping(path="/update_Compte/{id}")
	public Compte updateCompte(@PathVariable Long id,@RequestBody Compte cl){
		cl.setIdCompte(id);
		return CompteR.save(cl);
		
	}
	@DeleteMapping(path="/delete_Compte/{id}")
	public void deleteCompte(@PathVariable Long id){
		CompteR.deleteById(id);
		
	}
}
