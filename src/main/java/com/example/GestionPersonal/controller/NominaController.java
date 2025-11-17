package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.GestionPersonal.entity.Nomina;
import com.example.GestionPersonal.service.INominaService;

@Controller
@RequestMapping("/nomina")
public class NominaController {
	
	@Autowired
	private INominaService servNomina;

	@PostMapping("/crear")
	public String crearNomina(Nomina nomina) {
		
		servNomina.crearNomina(nomina);
		
		return null;
	}
	
	@PostMapping("/eleminar")
    public String eleminarNomina(@RequestParam("IdNomina") Long id) {
		
		servNomina.eleminarNomina(id);
		
		return null;
	}
	
	@PostMapping("/editar")
    public String editarNomina(@RequestParam("IdNomina") Long id, 
    		                   Nomina nomina) {
		
		servNomina.editarNomina(id, nomina);
		
		return null;
	}
	@GetMapping("/buscar")
    public String buscarNomina(@RequestParam("IdNomina") Long id) {
		
		servNomina.BuscarNomina(id);
		
		return null;
	}
	@GetMapping("/listar")
    public String listarrNomina(Model model) {
		
		model.addAttribute("listNomina", servNomina.ListaNomina());
		
		return null;
	}
	
	@GetMapping("/pag/cargar")
	public String paginaCargar() {
		
		return "nomina/carga";
	}
	
	@GetMapping("/pag/listar")
	public String paginaListar() {
		
		return "nomina/lista";
	}
}
