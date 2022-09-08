package com.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.repository.model.Cliente;

@Repository
@Transactional
public class ClienteRepositoryImpl implements IClienteRepository {
@PersistenceContext
private EntityManager em;

@Override
public void agregar(Cliente cliente) {
	// TODO Auto-generated method stub
	this.em.persist(cliente);
}

@Override
public Cliente buscar(Integer id) {
	// TODO Auto-generated method stub
	return this.em.find(Cliente.class, id);
} 

}
