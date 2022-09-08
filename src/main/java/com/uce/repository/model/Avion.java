package com.uce.repository.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion implements Serializable{

	private static final long serialVersionUID = -99861743462864747L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "avio_id")
	private Integer id; 
	@Column(name ="avio_capacidad_asientos")
	private Integer capacidadAsientos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "avion")
	private List<Vuelo> vuelos; 
	
	@Column(name = "avio_nombre")
	private String nombreAvion; 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCapacidadAsientos() {
		return capacidadAsientos;
	}
	public void setCapacidadAsientos(Integer capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}
	public List<Vuelo> getVuelos() {
		return vuelos;
	}
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	public String getNombreAvion() {
		return nombreAvion;
	}
	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
