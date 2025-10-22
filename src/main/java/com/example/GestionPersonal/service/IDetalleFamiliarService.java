package com.example.GestionPersonal.service;

import java.util.List;
import com.example.GestionPersonal.entity.DetalleFamiliar;

public interface IDetalleFamiliarService {

	void crearDetalleFamiliar(DetalleFamiliar detalleFamiliar);
	void eliminarDetalleFamiliar(Long id);
	void editarDetalleFamiliar(Long id, DetalleFamiliar detalleFamiliar);
	DetalleFamiliar buscarDetalleFamiliar(Long id);
	List<DetalleFamiliar> listarDetalleFamiliares();
	
	
}
