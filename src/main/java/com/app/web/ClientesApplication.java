package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.app.web.repository.clienteRepositorio;

@SpringBootApplication
public class ClientesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

	@Autowired
	private clienteRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		Cliente cliente1 = new Cliente("keppler", "Sanchez", "Kepplersanchez@gmail.com","1127340537","3002609211");
		repositorio.save(cliente1);
		
		Cliente cliente2 = new Cliente("Adriana", "Alvarez", "zabalanan@gmail.com","946162216", "3112916880");
		repositorio.save(cliente2);
		*/
	}

}
