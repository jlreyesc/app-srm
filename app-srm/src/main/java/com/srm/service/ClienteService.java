package com.srm.service;
import java.util.List;

import com.srm.domain.Cliente;

public interface ClienteService {
	
	Cliente create(Cliente cliente);

    List<Cliente> findAll();

    Cliente update(Cliente user);

}
