package com.example.GestionPersonal.service;

import java.util.List;

import com.example.GestionPersonal.entity.Cargo;

public interface ICargoService {
	
	void crearCargo(Cargo cargo);
	
	void eleminarCargo(Long id);
	
	void editarCargo(Long id, Cargo cargo);
	
	Cargo BuscarCargo(Long id);
	
	List<Cargo> ListaCargo();

}
