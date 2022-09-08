package com.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.uce.repository.model.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository{

	@PersistenceContext
	private EntityManager em; 
	
	
	@Override
	public void agregar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.em.persist(vuelo);
		
	}


	@Override
	public List<Vuelo> buscarPorOrigen(String origen) {
		System.out.println(origen);
		TypedQuery<Vuelo> myQuery = this.em.createQuery("SELECT v from Vuelo v where v.estado = :Disponible and v.origen=:origen",Vuelo.class);
		myQuery.setParameter("origen", origen); 
		myQuery.setParameter("Disponible", "Disponible"); 
		return myQuery.getResultList();
		
	}


	@Override
	public List<Vuelo> buscarPorDestino(String destino) {
		TypedQuery<Vuelo> myQuery = this.em.createQuery("SELECT v from Vuelo v WHERE v.estado= :disponible and v.destino = :destino",Vuelo.class);
		myQuery.setParameter("destino", destino); 
		myQuery.setParameter("disponible", "Disponible"); 
		return myQuery.getResultList();
		
	}


	@Override
	public List<Vuelo> buscarPorFechaV(String FechaV) {
		TypedQuery<Vuelo> myQuery = this.em.createQuery("SELECT v from Vuelo v WHERE v.estado=:disponible and v.fechaVuelo = :fechaV",Vuelo.class);
		myQuery.setParameter("fechaV", FechaV);
		myQuery.setParameter("disponible", "Disponible");
		return myQuery.getResultList();
		
	}


	@Override
	public Vuelo buscarporNumeroV(Integer numeroV) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.em.createQuery("SELECT v from Vuelo v WHERE v.numero=:numeroV",Vuelo.class);
		myQuery.setParameter("numeroV", numeroV); 
		return myQuery.getSingleResult();
	}


	@Override
	public void comprarAsientos(Vuelo vuelo, Integer cantidad) {
		Integer cantA = vuelo.getAsientosDisponibles(); 
		vuelo.setAsientosDisponibles(cantA-cantidad);
		this.em.merge(vuelo); 
		
	}


	@Override
	public void cambiarEstado(Vuelo vuelo, String estado) {
		// TODO Auto-generated method stub
		vuelo.setEstado(estado);
		this.em.merge(vuelo); 
	}


	@Override
	public Vuelo buscarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.em.find(Vuelo.class, id);
	}



	
	
}
