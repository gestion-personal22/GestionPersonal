package com.example.GestionPersonal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GestionPersonal.entity.Legajo;
import com.example.GestionPersonal.repository.ILegajoRepository;
import com.example.GestionPersonal.service.ILegajoService;

@Service
public class LegajoService implements ILegajoService{
	
	@Autowired
	private ILegajoRepository repoLegajo;

	@Override
	public void crearLegajo(Legajo legajo) {
		
		repoLegajo.save(legajo);
		
	}

	@Override
	public void eliminarLegajo(Long id) {
		
		repoLegajo.deleteById(id);
	}

	@Override
	public void editarLegajo(Long id, Legajo legajo) {
		
		Legajo legajoE = this.buscarLegajo(id);
		
		legajoE.setNombre(legajo.getNombre());
		legajoE.setApellido(legajo.getApellido());
		legajoE.setDni(legajo.getDni());
		legajoE.setFechaNacimiento(legajo.getFechaNacimiento());
		legajoE.setCorreo(legajo.getCorreo());
		legajoE.setCuil(legajo.getCuil());
		legajoE.setTelefono(legajo.getTelefono());
		legajoE.setDireccion(legajo.getDireccion());
		legajoE.setCargo(legajo.getCargo());
		legajoE.setTitulo(legajo.getTitulo());
		legajoE.setEstadoCivil(legajo.getEstadoCivil());
		legajoE.setFechaRegistro(legajo.getFechaRegistro());
		legajoE.setFamiliares(legajo.getFamiliares());
		
		this.crearLegajo(legajoE);
		
	}

	@Override
	public Legajo buscarLegajo(Long id) {
		
		return repoLegajo.findById(id).orElse(null);
	}

	@Override
	public List<Legajo> listarLegajos() {
		
		return repoLegajo.findAll();
	} 

}
