package com.uce.repository;

import java.util.List;

import com.uce.repository.model.Vuelo;

public interface IVueloRepository {
	public void agregar(Vuelo vuelo); 
	public List<Vuelo> buscarPorOrigen(String origen);
	public List<Vuelo> buscarPorDestino(String destino);
	public List<Vuelo> buscarPorFechaV(String FechaV);
	public Vuelo buscarporNumeroV(Integer numeroV);
	public void comprarAsientos(Vuelo vuelo, Integer cantidad); 
	public void cambiarEstado(Vuelo vuelo, String estado); 
	public Vuelo buscarPorID(Integer id); 
}
