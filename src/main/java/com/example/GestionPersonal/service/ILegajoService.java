package com.example.GestionPersonal.service;

import java.util.List;

import com.example.GestionPersonal.entity.Legajo;

public interface ILegajoService {
	
	void crearLegajo (Legajo legajo);
	void eliminarLegajo (Long id);
	void editarLegajo (Long id, Legajo legajo);
	Legajo buscarLegajo (Long id);
	List <Legajo> listarLegajos();
	
	
}
