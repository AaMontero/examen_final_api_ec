package com.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.repository.IClienteRepository;
import com.uce.repository.model.Cliente;
@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteRepository clieRep;

	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clieRep.agregar(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.clieRep.buscar(id);
	} 
	
}
