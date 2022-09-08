package com.uce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.repository.IVueloRepository;
import com.uce.repository.model.Vuelo;
import com.uce.service.to.VueloTo;
@Service
public class VueloServiceImpl implements IVueloService{
	@Autowired
	private IVueloRepository vueloRep;

	@Override
	public void agregar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRep.agregar(vuelo);
	}

	@Override
	public List<VueloTo> buscarPorOrigen(String origen) {
		// TODO Auto-generated method stub
		List<Vuelo> lista =  this.vueloRep.buscarPorOrigen(origen);
		System.out.println(lista.size());
		List<VueloTo> listVueloTo =  lista.stream().map(vuelo -> this.convertirVueloTo(vuelo))
				.collect(Collectors.toList()); 
		return listVueloTo;
	}

	@Override
	public List<VueloTo> buscarPorDestino(String destino) {
		// TODO Auto-generated method stub
		List<Vuelo> lista = this.vueloRep.buscarPorDestino(destino);
		List<VueloTo> listVueloTo =  lista.stream().map(vuelo -> this.convertirVueloTo(vuelo))
				.collect(Collectors.toList()); 
		return listVueloTo;
	}

	@Override
	public List<VueloTo> buscarPorFechaV(String FechaV) {
		// TODO Auto-generated method stub
		List<Vuelo> lista = this.vueloRep.buscarPorFechaV(FechaV);
		List<VueloTo> listVueloTo =  lista.stream().map(vuelo -> this.convertirVueloTo(vuelo))
				.collect(Collectors.toList()); 
		return listVueloTo;
	} 
	
	public VueloTo convertirVueloTo(Vuelo vuelo) {
		VueloTo vueloTo = new VueloTo(); 
		vueloTo.setDestino(vuelo.getDestino());
		vueloTo.setOrigen(vuelo.getOrigen());
		vueloTo.setNombreAvion(vuelo.getAvion().getNombreAvion());
		vueloTo.setNumeroVuelo(vuelo.getNumero());
		vueloTo.setValorAsiento(vuelo.getValorAsiento());
		vueloTo.setCategoria(vuelo.getCategoria());
		return vueloTo; 

	}

	@Override
	public void comprarAsiento(Vuelo vuelo, Integer numeroB) {
		// TODO Auto-generated method stub
		this.vueloRep.comprarAsientos(vuelo, numeroB);
	}

	@Override
	public Vuelo buscarPorNumero(Integer num) {
		// TODO Auto-generated method stub
		return this.vueloRep.buscarporNumeroV(num);
	}

	@Override
	public void cambiarDiponible(Vuelo vuelo, String estado) {
		// TODO Auto-generated method stub
		this.vueloRep.cambiarEstado(vuelo, estado);
		
	}

	@Override
	public Vuelo buscarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.vueloRep.buscarPorID(id);
	}
	
}
