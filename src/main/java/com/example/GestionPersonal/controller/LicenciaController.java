package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.GestionPersonal.entity.Licencia;
import com.example.GestionPersonal.service.ILicenciaService;



@Controller
@RequestMapping("/licencia")
public class LicenciaController {

	@Autowired
	private ILicenciaService servLicencia;

	@PostMapping("/crear")
	public String crearLicencia(Licencia licencia) {
        servLicencia.crearLicencia(licencia);
		return null;
	}

	@PostMapping("/eliminar")
	public String eliminarLicencia(@RequestParam("idLicencia") Long id) {
		servLicencia.eliminarLicencia(id);
		return null;
	}
	
	@PostMapping("/editar")
	public String editarLicencia(@RequestParam("idLicencia") Long id, Licencia licencia) {
		servLicencia.editarLicencia(id, licencia);
		return null;
	}
	
	@GetMapping("/buscar")
	public String buscarLicencia(@RequestParam("idLicencia") Long id) {
		servLicencia.buscarLicencia(id);
		return null;
	}
	
	@GetMapping("/lista")
	public String listarLicencia(Model model) {
		model.addAttribute("listLic",servLicencia.listarLicencias());
		return null;
	}
	
	@GetMapping("/pag/cargar")
	public String paginaCargar() {
		
		return "licencia/carga";
	}
}
