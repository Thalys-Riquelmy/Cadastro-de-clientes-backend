package com.project.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.api.modelo.Cliente;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long>{
	
	

}
