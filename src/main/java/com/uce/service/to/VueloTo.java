package com.uce.service.to;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.hateoas.RepresentationModel;

public class VueloTo extends RepresentationModel<VueloTo> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6660796767079503622L;
	 private Integer numeroVuelo; 
	 private String origen; 
	 private String destino; 
	 private String categoria; 
	 private String nombreAvion; 
	 private BigDecimal valorAsiento;
	 
	 
	public Integer getNumeroVuelo() {
		return numeroVuelo;
	}
	public void setNumeroVuelo(Integer numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNombreAvion() {
		return nombreAvion;
	}
	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}
	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}
	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	} 
	 
	 
	 
}
