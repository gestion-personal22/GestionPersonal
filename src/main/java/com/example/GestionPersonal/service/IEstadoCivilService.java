package com.example.GestionPersonal.service;

import java.util.List;

import com.example.GestionPersonal.entity.EstadoCivil;

public interface IEstadoCivilService {
	
	void crearEstadoC(EstadoCivil estadocivil);
	
	void eleminarEstadoC(Long id);
	
	void editarEstadoCivil(Long id, EstadoCivil estadocivil);
	
	EstadoCivil BuscarEstadoC(Long id);
	
	List<EstadoCivil> ListaEstadoC();
	
}
