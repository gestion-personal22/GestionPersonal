package com.example.GestionPersonal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GestionPersonal.entity.Asistencia;
import com.example.GestionPersonal.repository.IAsistenciaRepository;

@Service
public class AsistenciaService implements IAsistenciaService{

	@Autowired
	private IAsistenciaRepository repoAsistencia;
	
	@Override
	public void crearAsistencia(Asistencia asistencia) {
		
		repoAsistencia.save(asistencia);
		
	}

	@Override
	public void eliminarAsistencia(Long id) {
		
		repoAsistencia.deleteById(id);
		
	}

	@Override
	public void editarAsistencia(Long id, Asistencia asistencia) {
		
		Asistencia asistenciaB = this.buscarAsistencia(id);
		
		asistenciaB.setHoraEntrada(asistencia.getHoraEntrada());
		asistenciaB.setHoraSalida(asistencia.getHoraSalida());
		asistenciaB.setFecha(asistencia.getFecha());
		
		this.crearAsistencia(asistenciaB);
		
	}

	@Override
	public Asistencia buscarAsistencia(Long id) {
		
		return repoAsistencia.findById(id).orElse(null);
	}

	@Override
	public List<Asistencia> listarAsistencias() {
		
		return repoAsistencia.findAll();
	}

	
	
	
	
}
