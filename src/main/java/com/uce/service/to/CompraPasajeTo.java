package com.uce.service.to;

import java.io.Serializable;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

public class CompraPasajeTo extends RepresentationModel<CompraPasajeTo> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3095884707583991224L;
	private Integer id; 
	private Integer numeroVuelo; 
	private String fechaVuelo;
	private String estadoVuelo; 
	private Integer numeroCompra; 
	private Integer numeroAsientosC;
	private List<String> Estados;
	private String nombreCliente;
	public Integer getNumeroVuelo() {
		return numeroVuelo;
	}
	public void setNumeroVuelo(Integer numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	public String getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	public String getEstadoVuelo() {
		return estadoVuelo;
	}
	public void setEstadoVuelo(String estadoVuelo) {
		this.estadoVuelo = estadoVuelo;
	}
	public Integer getNumeroCompra() {
		return numeroCompra;
	}
	public void setNumeroCompra(Integer numeroCompra) {
		this.numeroCompra = numeroCompra;
	}
	public Integer getNumeroAsientosC() {
		return numeroAsientosC;
	}
	public void setNumeroAsientosC(Integer numeroAsientosC) {
		this.numeroAsientosC = numeroAsientosC;
	}
	public List<String> getEstados() {
		return Estados;
	}
	public void setEstados(List<String> estados) {
		Estados = estados;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	} 
	
	
	
}
