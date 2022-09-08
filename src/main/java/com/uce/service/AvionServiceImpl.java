package com.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.repository.IAvionRepository;
import com.uce.repository.model.Avion;

@Service
public class AvionServiceImpl implements IAvionService{

	@Autowired
	private IAvionRepository avionRep;

	@Override
	public void agregar(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRep.agregar(avion);
		
	} 
	
	
	
}
