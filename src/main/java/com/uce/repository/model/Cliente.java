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
@Table(name = "cliente")
public class Cliente  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6419423316481437299L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clie_id")
	private Integer id;
	@Column(name = "clie_nombre")
	private String nombre;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<CompraPasaje> pasajes;
	public List<CompraPasaje> getPasajes() {
		return pasajes;
	}
	public void setPasajes(List<CompraPasaje> pasajes) {
		this.pasajes = pasajes;
	} 
	
	
}
