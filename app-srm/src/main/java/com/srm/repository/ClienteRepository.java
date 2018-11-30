package com.srm.repository;
import org.springframework.data.repository.Repository;

import com.srm.domain.Cliente;

import java.util.List;

public interface ClienteRepository extends Repository<Cliente, Integer> {
	
	void delete(Cliente cliente);

    List<Cliente> findAll();

    Cliente save(Cliente cliente);

}
