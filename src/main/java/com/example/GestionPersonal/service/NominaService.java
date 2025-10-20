package com.example.GestionPersonal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestionPersonal.entity.Nomina;
import com.example.GestionPersonal.repository.INominaRepository;

@Service
public class NominaService implements INominaService {
	
	@Autowired
	private INominaRepository repoNomina;

	@Override
	public void crearNomina(Nomina nomina) {
		
		repoNomina.save(nomina);
	}

	@Override
	public void eleminarNomina(Long id) {
		
		repoNomina.deleteById(id);
	}

	@Override
	public void editarNomina(Long id, Nomina nomina) {
		
		Nomina nominaB = this.BuscarNomina(id);
		
		nominaB.setDeduccion(nomina.getDeduccion());
		nominaB.setRenumeracion(nomina.getRenumeracion());
		nominaB.setNovedades(nomina.getNovedades());
		
		this.crearNomina(nominaB);
		
	}

	@Override
	public Nomina BuscarNomina(Long id) {
		
		return repoNomina.findById(id).orElse(null);
	}

	@Override
	public List<Nomina> ListaNomina() {
		
		return repoNomina.findAll();
	}

}
