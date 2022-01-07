package com.example.EmissionTransfertNational.web;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.EmissionTransfertNational.entities.*;
import com.example.EmissionTransfertNational.repositories.*;


@RestController
public class ClientRestController {
	private ClientRepository clientR;
	private CompteRepository cptR;
	private PieceIdentiteRepository pR;
	public ClientRestController(ClientRepository cR,PieceIdentiteRepository pR, CompteRepository cptR){
			this.clientR=cR;
			this.cptR=cptR;
			this.pR=pR;
	}
	@GetMapping(path="/get_clients")
	public List<Client>listClients(){
		return clientR.findAll();
		
	}
	@GetMapping(path="/get_client/{id}")
	public Client getClient(@PathVariable Long id){
		return clientR.findById(id).get();
		
	}
	@PostMapping(path="/add_client")
	public Client saveClient(@RequestBody Client client){
		 PieceIdentite pi=client.getPiece_identite();
		 pR.save(pi);
		 for(Compte c:client.getComptes()){
			 cptR.save(c);
		 }
		 //clientR.save(client);
		 pi.setClient(client);
		 for(Compte c:client.getComptes()){
			 c.setClient(client);
			 //cptR.save(c);
		 }
		return clientR.save(client);
	}



	@PutMapping(path="/update_client/{id}")
	public Client updateClient(@PathVariable Long id,@RequestBody Client cl){
		cl.setIdClient(id);
		return clientR.save(cl);
		
	}
	@DeleteMapping(path="/delete_client/{id}")
	public void deleteClient(@PathVariable Long id){
		clientR.deleteById(id);
		
	}

}
