package com.example.GestionPersonal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GestionPersonal.entity.DetalleFamiliar;
import com.example.GestionPersonal.repository.IDetalleFamiliarRepository;

@Service
public class DetalleFamiliarService implements IDetalleFamiliarService{

	@Autowired
	private IDetalleFamiliarRepository repoDetalle;
	
	@Override
	public void crearDetalleFamiliar(DetalleFamiliar detalleFamiliar) {
		
		repoDetalle.save(detalleFamiliar);
		
	}

	@Override
	public void eliminarDetalleFamiliar(Long id) {
		
		repoDetalle.deleteById(id);
		
	}

	@Override
	public void editarDetalleFamiliar(Long id, DetalleFamiliar detalleFamiliar) {
		
		DetalleFamiliar detalleB = this.buscarDetalleFamiliar(id);
		
		detalleB.setNombre(detalleFamiliar.getNombre());
		detalleB.setApellido(detalleFamiliar.getApellido());
		detalleB.setDni(detalleFamiliar.getDni());
		detalleB.setCuil(detalleFamiliar.getCuil());
		detalleB.setTelefono(detalleFamiliar.getTelefono());
		detalleB.setFechaNacimiento(detalleFamiliar.getFechaNacimiento());
		detalleB.setDireccion(detalleFamiliar.getDireccion());
		detalleB.setTipo(detalleFamiliar.getTipo());
		
		this.crearDetalleFamiliar(detalleB);
		
	}

	@Override
	public DetalleFamiliar buscarDetalleFamiliar(Long id) {
		return repoDetalle.findById(id).orElse(null);
	}

	@Override
	public List<DetalleFamiliar> listarDetalleFamiliares() {
		return repoDetalle.findAll();
	}

}
