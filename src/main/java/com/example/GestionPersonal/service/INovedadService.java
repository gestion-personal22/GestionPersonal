package com.example.GestionPersonal.service;

import java.util.List;
import com.example.GestionPersonal.entity.Novedad;

public interface INovedadService {

	void crearNovedad(Novedad novedad);
	void eliminarNovedad(Long id);
	void editarNovedad(Long id, Novedad novedad);
	Novedad buscarNovedad(Long id);
	List<Novedad> listarNovedad();
}
