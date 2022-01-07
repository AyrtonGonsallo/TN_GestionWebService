package com.example.EmissionTransfertNational.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmissionTransfertNational.entities.PieceIdentite;
import com.example.EmissionTransfertNational.repositories.PieceIdentiteRepository;
@RestController
public class PieceIdentiteRestController {
	private PieceIdentiteRepository PieceIdentiteR;
	public PieceIdentiteRestController(PieceIdentiteRepository cR){
			this.PieceIdentiteR=cR;
	}
	@GetMapping(path="/get_PieceIdentites")
	public List<PieceIdentite>listPieceIdentites(){
		return PieceIdentiteR.findAll();
		
	}
	@GetMapping(path="/get_PieceIdentite/{id}")
	public PieceIdentite getPieceIdentite(@PathVariable Long id){
		return PieceIdentiteR.findById(id).get();
		
	}
	@PostMapping(path="/add_PieceIdentite")
	public PieceIdentite savePieceIdentite(@RequestBody PieceIdentite PieceIdentite){
		
		return PieceIdentiteR.save(PieceIdentite);
		
	}
	@PutMapping(path="/update_PieceIdentite/{id}")
	public PieceIdentite updatePieceIdentite(@PathVariable Long id,@RequestBody PieceIdentite cl){
		cl.setId(id);
		return PieceIdentiteR.save(cl);
		
	}
	@DeleteMapping(path="/delete_PieceIdentite/{id}")
	public void deletePieceIdentite(@PathVariable Long id){
		PieceIdentiteR.deleteById(id);
		
	}
}
