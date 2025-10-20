package com.example.GestionPersonal.service.imple;

import java.util.List;
import com.example.GestionPersonal.entity.Direccion;

public interface IDireccionService {

	void crearDireccion(Direccion direccion);
	void eliminarDireccion(Long id);
	void editarDireccion(Long id, Direccion direccion);
	Direccion buscarDireccion(Long id);
	List<Direccion> listarDirecciones();
	
}
