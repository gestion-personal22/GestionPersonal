package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.GestionPersonal.entity.Legajo;
import com.example.GestionPersonal.service.ICargoService;
import com.example.GestionPersonal.service.IEstadoCivilService;
import com.example.GestionPersonal.service.ILegajoService;

@Controller
@RequestMapping("/legajo") 
public class LegajoContoller {
	
	@Autowired
	private ILegajoService servLegajo;
	
	@Autowired
	private ICargoService servCargo;
	
	@Autowired
	private IEstadoCivilService servEstadoCivil;
	
	@PostMapping("/crear")
	public String crearLegajo (Legajo legajo, RedirectAttributes redirectAttributes) {
		
		servLegajo.crearLegajo(legajo);
		
		redirectAttributes.addFlashAttribute("mensaje", "Legajo creado con éxito.");
		
		return "redirect:/legajo/pag/cargar";
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
	
	
	@GetMapping("/pag/cargar")
	public String paginaCargar(Model model) {
		
		Legajo l = new Legajo();		
		
		model.addAttribute("legajo", l);
		
        model.addAttribute("listaEstadosCiviles", servEstadoCivil.ListaEstadoC());
		
		model.addAttribute("listaCargos", servCargo.ListaCargo());
		
		return "legajo/carga";
	}
	
	@GetMapping("/pag/listar")
	public String paginaListar(Model model) {
		
		model.addAttribute("listaLegajo", servLegajo.listarLegajos());
		
		return "legajo/lista";
	}
	
}
