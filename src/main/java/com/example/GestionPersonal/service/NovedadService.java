package com.example.GestionPersonal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.GestionPersonal.entity.Novedad;
import com.example.GestionPersonal.repository.INovedadRepository;
import com.example.GestionPersonal.service.INovedadService;

public class NovedadService implements INovedadService{
	
	@Autowired
	private INovedadRepository repoNovedad;
	
	@Override
	public void crearNovedad(Novedad novedad) {
		// TODO Auto-generated method stub
		repoNovedad.save(novedad);
	}

	@Override
	public void eliminarNovedad(Long id) {
		// TODO Auto-generated method stub
		repoNovedad.deleteById(id);
	}

	@Override
	public void editarNovedad(Long id, Novedad novedad) {
		// TODO Auto-generated method stub
		Novedad novedadB = this.buscarNovedad(id);
		
		novedadB.setDescripcion(novedadB.getDescripcion());
		novedadB.setLegajo(novedadB.getLegajo());
		novedadB.setAsistencias(novedadB.getAsistencias());
		novedadB.setLicencias(novedadB.getLicencias());
		novedadB.setNomina(novedadB.getNomina());
		
		this.crearNovedad(novedadB);
	}

	@Override
	public Novedad buscarNovedad(Long id) {
		// TODO Auto-generated method stub
		return repoNovedad.findById(id).orElse(null);
	}

	@Override
	public List<Novedad> listarNovedad() {
		// TODO Auto-generated method stub
		return repoNovedad.findAll();
	}

}
