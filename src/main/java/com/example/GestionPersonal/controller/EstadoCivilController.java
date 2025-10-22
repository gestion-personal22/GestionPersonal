package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.GestionPersonal.entity.EstadoCivil;
import com.example.GestionPersonal.service.IEstadoCivilService;

@Controller
@RequestMapping("/estadocivil")
public class EstadoCivilController {
	
	@Autowired
	private IEstadoCivilService servEstadoC;
	
@PostMapping("/crear")
public String crearEstadoC(EstadoCivil estadocivil) {
	
	servEstadoC.crearEstadoC(estadocivil);
	
	return null;
}

@PostMapping("/eleminar")
public String eleminarEstadoC(@RequestParam("idEstadoC") Long id) {
	
	servEstadoC.eleminarEstadoC(id);
	
	return null;
}

@PostMapping("/editar")
public String editarEstadoC(@RequestParam("idEstadoC") Long id, EstadoCivil estadocivil) {
	
	servEstadoC.editarEstadoCivil(id, estadocivil);
	
	return null;
}


@GetMapping("/buscar")
public String buscarEstadoC(@RequestParam("idEstadoC") Long id) {
	
	servEstadoC.BuscarEstadoC(id);
	
	return null;
}

@GetMapping("/listar")
public String listaEstadoC(Model model) {
	
	model.addAttribute("listEstadoC",servEstadoC.ListaEstadoC());
	
	return null;
}
}
