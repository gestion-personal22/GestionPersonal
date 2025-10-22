package com.example.GestionPersonal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GestionPersonal.entity.Direccion;
import com.example.GestionPersonal.repository.IDireccionRepository;

@Service
public class DireccionService implements IDireccionService{

	@Autowired
	private IDireccionRepository repoDireccion;
	
	@Override
	public void crearDireccion(Direccion direccion) {
		
		repoDireccion.save(direccion);
		
	}

	@Override
	public void eliminarDireccion(Long id) {
		
		repoDireccion.deleteById(id);
		
	}

	@Override
	public void editarDireccion(Long id, Direccion direccion) {
		
		Direccion direccionB = this.buscarDireccion(id);
		
		direccionB.setCalle(direccion.getCalle());
		direccionB.setLocalidad(direccion.getLocalidad());
		direccionB.setProvincia(direccion.getProvincia());
		
		this.crearDireccion(direccionB);
		
	}

	@Override
	public Direccion buscarDireccion(Long id) {
		return repoDireccion.findById(id).orElse(null);
	}

	@Override
	public List<Direccion> listarDirecciones() {
		return repoDireccion.findAll();
	}

}
