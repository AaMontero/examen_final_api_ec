package com.uce.service;

import com.uce.repository.model.Cliente;

public interface IClienteService {
	public void agregar(Cliente cliente);
	public Cliente buscar(Integer id);
}
