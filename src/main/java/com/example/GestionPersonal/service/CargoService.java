package com.example.GestionPersonal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestionPersonal.entity.Cargo;
import com.example.GestionPersonal.repository.ICargoRepository;

@Service
public class CargoService implements ICargoService {
	
	@Autowired
	private ICargoRepository repoCargo;

	@Override
	public void crearCargo(Cargo cargo) {
		
		repoCargo.save(cargo);
		
	}

	@Override
	public void eleminarCargo(Long id) {
	
		repoCargo.deleteById(id);
		
	}

	@Override
	public void editarCargo(Long id, Cargo cargo) {
		
		Cargo cargoB = this.BuscarCargo(id);
		
		cargoB.setCargo(cargo.getCargo());
		cargoB.setLegajo(cargo.getLegajo());
		
		this.crearCargo(cargoB);
		
		
	}

	@Override
	public Cargo BuscarCargo(Long id) {
		
		return repoCargo.findById(id).orElse(null);
	}

	@Override
	public List<Cargo> ListaCargo() {
		
		return repoCargo.findAll();
	}

}
