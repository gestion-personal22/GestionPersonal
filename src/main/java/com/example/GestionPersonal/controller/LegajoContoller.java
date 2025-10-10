package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.GestionPersonal.entity.Legajo;
import com.example.GestionPersonal.service.ILegajoService;

@Controller
@RequestMapping("/legajo") 
public class LegajoContoller {
	
	@Autowired
	private ILegajoService servLegajo;
	
	
	
	@PostMapping("/crear")
	public String crearLegajo (Legajo legajo) {
		
		servLegajo.crearLegajo(legajo);
		
		return null;
	}
	
	
	@PostMapping ("/eliminar")
	public String eliminarLegajo (@RequestParam("idLegajo") Long id) {
		
		servLegajo.eliminarLegajo(id);
		
		return null;
	}
	
	
	@PostMapping("/editar")
	public String editarLegajo (@RequestParam("idLegajo")Long id, Legajo legajo) {
		
		servLegajo.editarLegajo(id, legajo);
		
		return null;
	}
	
	
	
	@GetMapping("/buscar")
	public String buscarLegajo (@RequestParam("idLegajo")Long id) {
		
		servLegajo.buscarLegajo(id);
		
		return null;
	}
	
	
	@GetMapping ("/lista")
	public String listarLegajo (Model model) {
	
		model.addAttribute("listLeg", servLegajo.listarLegajos());
		
		return null;
	}
	
}
