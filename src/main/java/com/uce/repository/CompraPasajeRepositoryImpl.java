package com.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.repository.model.CompraPasaje;
import com.uce.repository.model.Vuelo;

@Repository
@Transactional
public class CompraPasajeRepositoryImpl implements ICompraPasajeRepository{

	@PersistenceContext
	private EntityManager em; 
	
	@Override
	public void agregar(CompraPasaje compraP) {
		// TODO Auto-generated method stub
		this.em.persist(compraP);
		
	}

	@Override
	public void realizarReserva(CompraPasaje compraP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprarBoletos(Vuelo vuelo, Integer numeroB, String tarjeta) {
		CompraPasaje compraP = new CompraPasaje(); 
		compraP.setCantidadAsientosComprados(numeroB);
		compraP.setFechaCompra(vuelo.getFechaVuelo());
		compraP.setNumeroTarjeta(tarjeta);
		compraP.setEstado("Reservado (R)");
		compraP.setVuelo(vuelo);
		agregar(compraP);
		
	}

	@Override
	public void cambiarCheckIn(Integer numero) {
		// TODO Auto-generated method stub
		CompraPasaje aux = buscarPasajePorNum(numero); 
		aux.setEstado("Check-in I");
		this.em.merge(aux); 
	}

	public CompraPasaje buscarPasajePorNum(Integer num) {
		return this.em.find(CompraPasaje.class,num) ;
	}

	@Override
	public List<CompraPasaje> buscarFechaVuelo(String fecha) {
		// TODO Auto-generated method stub
		TypedQuery<CompraPasaje> myQuery = this.em.createQuery("SELECT c from CompraPasaje c WHERE c.vuelo.fechaVuelo=:fecha",CompraPasaje.class);
		myQuery.setParameter("fecha", fecha); 
		return myQuery.getResultList();
		
	}


}
