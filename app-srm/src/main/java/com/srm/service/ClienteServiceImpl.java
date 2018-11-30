package com.srm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.srm.domain.Cliente;
import com.srm.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
    private ClienteRepository repository;
	
	@Override
	public Cliente create(Cliente cliente) {
		// TODO Auto-generated method stub
		return repository.save(cliente);
	}

	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	


	@Override
	public Cliente update(Cliente user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

}
