package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Cliente;

@Repository
public interface clienteRepositorio extends JpaRepository <Cliente, Long>{
	
	
}
