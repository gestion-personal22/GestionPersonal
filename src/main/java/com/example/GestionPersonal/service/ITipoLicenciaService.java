package com.example.GestionPersonal.service;

import java.util.List;

import com.example.GestionPersonal.entity.TipoLicencia;

public interface ITipoLicenciaService {
	
	void crearTipoLicencia (TipoLicencia tipoLicencia);
	void eliminarTipoLicencia (Long id);
	void editarTipoLicencia (Long id, TipoLicencia tipoLicencia);
	TipoLicencia buscarTipoLicencia (Long id);
	List<TipoLicencia> listarTipoLicencias();
}
