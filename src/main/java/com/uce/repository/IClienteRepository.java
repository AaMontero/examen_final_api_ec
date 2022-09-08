package com.uce.repository;

import com.uce.repository.model.Cliente;

public interface IClienteRepository {
	public void agregar(Cliente cliente); 
	public Cliente buscar(Integer id); 
}
