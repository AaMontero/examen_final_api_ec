package com.uce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uce.service.IVueloService;
import com.uce.service.to.VueloTo;

@RestController
@RequestMapping("/vuelos")
@CrossOrigin("http://localhost:8080/")
public class VuelosRestFulController {
	
	@Autowired
	private IVueloService vuelosServ;
	
	@GetMapping(path ="/dispOrigen/{origen}", produces = MediaType.APPLICATION_JSON_VALUE)
	private List<VueloTo> buscarDiponiblesOrigen(@PathVariable("origen") String origen) {
		List<VueloTo> lista =  this.vuelosServ.buscarPorOrigen(origen);
		return lista; 
		
	}
	@GetMapping(path ="/dispDestino/{destino}", produces = MediaType.APPLICATION_JSON_VALUE)
	private List<VueloTo> buscarDiponiblesDestino(@PathVariable("destino") String destino) {
		return this.vuelosServ.buscarPorDestino(destino); 
		
	}
	@GetMapping(path ="/dispFecha/{fecha}", produces = MediaType.APPLICATION_JSON_VALUE)
	private List<VueloTo> buscarDiponiblesFecha(@PathVariable("fecha") String fecha) {
		return this.vuelosServ.buscarPorFechaV(fecha); 
		
	}
	
	@GetMapping(path="/Disponible/{numero}")
	private boolean estaDisponible(@PathVariable Integer numero) {
		System.out.println(this.vuelosServ.buscarPorNumero(numero).getEstado());
		return (this.vuelosServ.buscarPorNumero(numero).getEstado().equals("Disponible"));
		
	}
	
	
}
