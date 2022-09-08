package com.uce.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.repository.ICompraPasajeRepository;
import com.uce.repository.model.CompraPasaje;
import com.uce.repository.model.Vuelo;
import com.uce.service.to.CompraPasajeTo;
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
	
	public CompraPasajeTo convertirCPTO(CompraPasaje compra) {
		CompraPasajeTo compraTo = new CompraPasajeTo(); 
		List<String> estados = Arrays.asList(compra.getEstado(), compra.getVuelo().getEstado()); 
		compraTo.setEstados(estados);
		compraTo.setEstadoVuelo(compra.getEstado());
		compraTo.setFechaVuelo(compra.getVuelo().getFechaVuelo());
		compraTo.setNombreCliente(compra.getCliente().getNombre());
		compraTo.setNumeroAsientosC(compra.getCantidadAsientosComprados());
		compraTo.setNumeroCompra(compra.getNumero());
		compraTo.setNumeroVuelo(compra.getVuelo().getNumero());
		return compraTo; 
	}
	
	public List<CompraPasajeTo> buscarVentasHoy(String fecha){
		List<CompraPasaje> lista = this.compraPReb.buscarFechaVuelo(fecha);
		List<CompraPasajeTo> listVueloTo =  lista.stream().map(cPasaje -> this.convertirCPTO(cPasaje))
				.collect(Collectors.toList()); 
		return listVueloTo;
	}
	
	
}
