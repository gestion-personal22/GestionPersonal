package com.example.GestionPersonal.service;

import java.util.List;
import com.example.GestionPersonal.entity.Asistencia;

public interface IAsistenciaService {

	void crearAsistencia(Asistencia asistencia);
	void eliminarAsistencia(Long id);
	void editarAsistencia(Long id, Asistencia asistencia);
	Asistencia buscarAsistencia(Long id);
	List<Asistencia> listarAsistencias();
	
}