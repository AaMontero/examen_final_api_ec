package com.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.repository.model.Avion;

@Repository
@Transactional
public class AvionRepositoryImpl implements IAvionRepository{
@PersistenceContext
private EntityManager em;

@Override
public void agregar(Avion avion) {
	// TODO Auto-generated method stub
	this.em.persist(avion);
} 

}
