package com.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.repository.ICompraPasajeRepository;
import com.uce.repository.model.CompraPasaje;
import com.uce.repository.model.Vuelo;
@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService{
	@Autowired
	private ICompraPasajeRepository compraPReb;

	@Override
	public void agregar(CompraPasaje compraP) {
		this.compraPReb.agregar(compraP);
		
	}

	@Override
	public void venderBoletos(Vuelo vuelo, Integer numeroB, String tarjeta) {
		// TODO Auto-generated method stub
		this.compraPReb.comprarBoletos(vuelo, numeroB, tarjeta);
		
	}

	@Override
	public void cambiarEstado(Integer numero) {
		// TODO Auto-generated method stub
		this.compraPReb.cambiarCheckIn(numero);
		
	} 
	

	
}
