package com.example.GestionPersonal.service;

import java.util.List;

import com.example.GestionPersonal.entity.Nomina;

public interface INominaService {

	void crearNomina(Nomina nomina);

	void eleminarNomina(Long id);

	void editarNomina(Long id, Nomina nomina);

	Nomina BuscarNomina(Long id);

	List<Nomina> ListaNomina();
	
}
