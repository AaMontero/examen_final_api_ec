package com.uce.service;

import java.util.List;

import com.uce.repository.model.Vuelo;
import com.uce.service.to.VueloTo;

public interface IVueloService {
	public void agregar(Vuelo vuelo); 
	public List<VueloTo> buscarPorOrigen(String origen);
	public List<VueloTo> buscarPorDestino(String destino);
	public List<VueloTo> buscarPorFechaV(String FechaV);
	public void comprarAsiento(Vuelo vuelo, Integer numeroB);
	public Vuelo buscarPorNumero(Integer num); 
	public void cambiarDiponible(Vuelo vuelo, String estado); 
	public Vuelo buscarPorID(Integer id); 
}	
