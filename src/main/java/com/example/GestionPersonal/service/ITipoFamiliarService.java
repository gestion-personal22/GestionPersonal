package com.example.GestionPersonal.service;

import java.util.List;

import com.example.GestionPersonal.entity.TipoFamiliar;

public interface ITipoFamiliarService {
	
	void crearTipoFamiliar (TipoFamiliar tipoFamiliar);
	void eliminarTipoFamiliar (Long id);
	void editarTipoFamiliar (Long id, TipoFamiliar tipoFamiliar);
	TipoFamiliar buscarTipoFamiliar (Long id);
	List<TipoFamiliar> listarTipoFamiliares();
	
}
