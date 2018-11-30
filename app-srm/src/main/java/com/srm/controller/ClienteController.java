package com.srm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.srm.domain.Cliente;
import com.srm.service.ClienteService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/clientes"})
public class ClienteController {
	
	@Autowired
    private ClienteService clienteService;
	
	@PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        
		/* Regla de Negocio */
		if (cliente.getRiesgo().equals("A") )
			cliente.setTasa_interes(0);
		if (cliente.getRiesgo().equals("B") )
			cliente.setTasa_interes(10);
		if (cliente.getRiesgo().equals("C") )
			cliente.setTasa_interes(20);
		
		return clienteService.create(cliente);
    }

    @PutMapping(path = {"/{id}"})
    public Cliente update(@PathVariable("id") int id, @RequestBody Cliente cliente){
    	cliente.setId(id);
        return clienteService.update(cliente);
    }

    
    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

}
