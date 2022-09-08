package com.uce.repository.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4807739689023626664L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "vuel_id")
	private Integer id;
	@Column(name= "vuel_numero")
	private Integer numero; 
	@Column(name= "vuel_fecha_vuelo")
	private String fechaVuelo; 
	@Column(name= "vuel_asientos_disponibles")
	private Integer asientosDisponibles; 
	@Column(name= "vuel_valor_asiento")
	private BigDecimal valorAsiento; 
	@Column(name= "vuel_estado")
	private String estado;
	@Column(name = "vuel_origen")
	private String origen;
	@Column(name = "vuel_destino")
	private String destino; 
	@Column(name ="vuel_categoria")
	private String categoria; 
	@ManyToOne
	@JoinColumn(name="avio_id")
	private Avion avion; 
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vuelo")
	private List<CompraPasaje> pasajes;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}
	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}
	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}
	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public List<CompraPasaje> getPasajes() {
		return pasajes;
	}
	public void setPasajes(List<CompraPasaje> pasajes) {
		this.pasajes = pasajes;
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
	
}
