package com.uce.repository;

import java.util.List;

import com.uce.repository.model.CompraPasaje;
import com.uce.repository.model.Vuelo;

public interface ICompraPasajeRepository {
	public void agregar(CompraPasaje compraP); 
	public void realizarReserva(CompraPasaje compraP); 
	public void comprarBoletos(Vuelo vuelo, Integer numeroB, String tarjeta); 
	public void cambiarCheckIn(Integer numero);
	public List<CompraPasaje> buscarFechaVuelo(String fecha);
}
