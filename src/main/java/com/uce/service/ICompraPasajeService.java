package com.uce.service;


import com.uce.repository.model.CompraPasaje;
import com.uce.repository.model.Vuelo;



public interface ICompraPasajeService {
	public void agregar(CompraPasaje compraP); 
	public void venderBoletos (Vuelo vuelo, Integer numeroB, String tarjeta); 
	public void cambiarEstado(Integer numero); 

}
