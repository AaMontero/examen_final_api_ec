package com.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uce.repository.model.Cliente;
import com.uce.repository.model.Vuelo;
import com.uce.service.IClienteService;
import com.uce.service.ICompraPasajeService;
import com.uce.service.IVueloService;
@RestController
@RequestMapping("/comprarPasaje")
@CrossOrigin("http://localhost:8080/")


public class CompraPasajeRestFulController {
	
	@Autowired
	private ICompraPasajeService copaService; 
	
	@Autowired 
	private IVueloService vuelService; 
	
	@Autowired
	private IClienteService clienteServ; 
	
	@PutMapping(path= "/comprar", consumes = MediaType.APPLICATION_JSON_VALUE)
	private void comprarBoletos(@RequestBody Vuelo vuelo, Integer numeroB, String tarjeta) {
		if(!vuelo.equals(null)) {
			if (vuelo.getAsientosDisponibles()>numeroB) {
				this.copaService.venderBoletos(vuelo, numeroB, tarjeta);
				this.vuelService.comprarAsiento(vuelo, numeroB);
			}else {
				System.out.println("ERROR NO EXISTEN BOLETOS DISPONIBLES");
				this.vuelService.cambiarDiponible(vuelo, "NO DISPONIBLE");
			}
		}else {
			System.out.println("EL VUELO NO EXISTE");
			
		}
		
	}
	
	@PutMapping(path ="/CheckIn/{numeroBol}")
	private void hacerCheckIn(@PathVariable Integer num) {
		this.copaService.cambiarEstado(num); 
		
	}
	

	@GetMapping(path ="/{idPasaje}/cliente")
	private Cliente buscarCliente(@PathVariable("idPasaje") Integer id) {
		return this.clienteServ.buscar(id); 
	}
	@GetMapping(path ="/{idPasaje}/vuelo")
	private Vuelo buscarVuelo(@PathVariable("idPasaje") Integer id) {
		return this.vuelService.buscarPorID(id); 
				
	}
	
	
}
