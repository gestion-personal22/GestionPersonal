package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.GestionPersonal.entity.TipoFamiliar;
import com.example.GestionPersonal.service.ITipoFamiliarService;

@Controller
@RequestMapping("/tipoFamiliar")
public class TipoFamiliarController {
	
	@Autowired
	private ITipoFamiliarService servTipoFamiliar;
	
	
	@PostMapping("/crear")
	public String crearTipoFamiliar (TipoFamiliar tipoFamiliar) {
		
		servTipoFamiliar.crearTipoFamiliar(tipoFamiliar);
		
		return null;
	}
	
	@PostMapping("/eliminar")
	public String eliminarTipoFamiliar (@RequestParam("/idTipoFamiliar")Long id) {
		
		servTipoFamiliar.eliminarTipoFamiliar(id);
		
		return null;
	}
	
	@PostMapping("/editar")
	public String editarTipoFamiliar (@RequestParam("/idTipoFamiliar")Long id, TipoFamiliar tipoFamiliar) {
	
		servTipoFamiliar.editarTipoFamiliar(id, tipoFamiliar);
		
		return null;
		
	}
	
	@GetMapping("/buscar")
	public String buscarTipoFamiliar (@RequestParam("/idTipoFamiliar")Long id) {
		
		servTipoFamiliar.buscarTipoFamiliar(id);
		
		return null;
	}
	
	
	@GetMapping("/lista")
	public String listarTipoFamiliar(Model model) {
		
		model.addAttribute("listTipoFam", servTipoFamiliar.listarTipoFamiliares());
		
		return null;
	}
	
	
	
	
	
	
	
	
	
}
