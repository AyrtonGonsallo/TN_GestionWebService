package com.example.EmissionTransfertNational;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.EmissionTransfertNational.entities.Client;
import com.example.EmissionTransfertNational.enums.Sexe;
import com.example.EmissionTransfertNational.enums.TypeClient;
import com.example.EmissionTransfertNational.repositories.ClientRepository;

@SpringBootApplication
public class EmissionTransfertNationalApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientR;

	public static void main(String[] args) {
		SpringApplication.run(EmissionTransfertNationalApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//http://localhost:1945/swagger-ui/index.html
		clientR.save(new Client(1L,"Caiceira","Junior","0634543456",null,null,TypeClient.de_passage,Sexe.M,null,"maroc","23 rue 23","j@c.com","meknes"));
		clientR.save(new Client(2L,"Miko","Manske","0634526374",null,null,TypeClient.partenaire,Sexe.M,null,"maroc","22 rue 23","m@m.com","marrakech"));
		clientR.save(new Client(3L,"Korey","Alexa","0645363784",null,null,TypeClient.de_passage,Sexe.Mme,null,"maroc","12 rue 2","k@a.com","safi"));
		clientR.findAll().forEach(cp->{
			System.out.println("Client "+cp.getIdClient()+" "+cp.getNom()+" "+cp.getPrenom());
		
		});
	}
}


