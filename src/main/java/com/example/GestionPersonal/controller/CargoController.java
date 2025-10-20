package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.GestionPersonal.entity.Cargo;
import com.example.GestionPersonal.service.ICargoService;

@Controller
@RequestMapping("/cargo")
public class CargoController {
	
	@Autowired
	private ICargoService servCargo;
	
	@PostMapping("/crear")
	public String crearCargo(Cargo cargo) {
		
		servCargo.crearCargo(cargo);
		
		return null;
	}
	
	@PostMapping("/eleminar")
	public String eleminarCargo(@RequestParam("idCargo") Long id) {
		
		servCargo.eleminarCargo(id);
		
		return null;
	}
	
	@PostMapping("/editar")
	public String editarCargo(@RequestParam("idCargo") Long id, Cargo cargo) {
		
		servCargo.editarCargo(id, cargo);
		
		return null;
	}
	
	@GetMapping("/buscar")
    public String buscarCargo(@RequestParam("idCargo") Long id) {
		
		servCargo.BuscarCargo(id);
		
		return null;
	}
	
	@GetMapping("/listar")
    public String listaCargo(Model model) {
		
		model.addAttribute("listCargo", servCargo.ListaCargo());
		
		return null;
	}
	

}
