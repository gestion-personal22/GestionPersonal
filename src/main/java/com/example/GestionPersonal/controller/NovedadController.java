package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.GestionPersonal.service.INovedadService;
import com.example.GestionPersonal.entity.Novedad;

@Controller
@RequestMapping("/novedad")
public class NovedadController {

	@Autowired
	private INovedadService servNovedad;
	
	@PostMapping("/crear")
	public String crearNovedad(Novedad novedad) {
		servNovedad.crearNovedad(novedad);
		return null;
	}
	@PostMapping("/eliminar")
	public String eliminarNovedad(@RequestParam("idNovedad") Long id) {
		servNovedad.eliminarNovedad(id);
		return null;
	}
	@PostMapping("/editar")
	public String editarNovedad(@RequestParam("idNovedad") Long id, Novedad novedad) {
		servNovedad.editarNovedad(id, novedad);
		return null;
	}
	@GetMapping("/buscar")
	public String buscarNovedad(@RequestParam("idNovedad") Long id) {
		servNovedad.buscarNovedad(id);
		return null;
	}
	@GetMapping("/lista")
	public String listarNovedad(Model model) {
		model.addAttribute("listNoved", servNovedad.listarNovedad());
		return null;
	}
	
}
