package com.example.GestionPersonal.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestionPersonal.entity.EstadoCivil;
import com.example.GestionPersonal.repository.IEstadoCivilRepository;
import com.example.GestionPersonal.service.IEstadoCivilService;

@Service
public class EstadoCivilService implements IEstadoCivilService {
	
	@Autowired
	private IEstadoCivilRepository repoEstadoC;
	

	@Override
	public void crearEstadoC(EstadoCivil estadocivil) {
		
		repoEstadoC.save(estadocivil);
		
	}

	@Override
	public void eleminarEstadoC(Long id) {
		
		repoEstadoC.deleteById(id);
		
	}

	@Override
	public void editarEstadoCivil(Long id, EstadoCivil estadocivil) {
		
		EstadoCivil estadoCB = this.BuscarEstadoC(id);
		
		estadoCB.setEstado(estadocivil.getEstado());
		estadoCB.setLegajo(estadocivil.getLegajo());
		
		this.crearEstadoC(estadoCB);
		
	}

	@Override
	public EstadoCivil BuscarEstadoC(Long id) {
		
		return repoEstadoC.findById(id).orElse(null);
	}

	@Override
	public List<EstadoCivil> ListaEstadoC() {
		
		return repoEstadoC.findAll();
	}
	
	

}
