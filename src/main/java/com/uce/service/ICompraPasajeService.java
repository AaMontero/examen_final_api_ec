package com.uce.service;

import java.util.List;

import com.uce.repository.model.CompraPasaje;
import com.uce.repository.model.Vuelo;
import com.uce.service.to.CompraPasajeTo;


public interface ICompraPasajeService {
	public void agregar(CompraPasaje compraP); 
	public void venderBoletos (Vuelo vuelo, Integer numeroB, String tarjeta); 
	public void cambiarEstado(Integer numero); 
	public List<CompraPasajeTo> buscarVentasHoy(String fecha); 
}
