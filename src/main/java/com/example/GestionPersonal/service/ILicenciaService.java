package com.example.GestionPersonal.service;

import java.util.List;
import com.example.GestionPersonal.entity.Licencia;

public interface ILicenciaService {

	void crearLicencia(Licencia licencia);
	void eliminarLicencia(Long id);
	void editarLicencia(Long id, Licencia licencia);
	Licencia buscarLicencia(Long id);
	List<Licencia> listarLicencias();
	
}
