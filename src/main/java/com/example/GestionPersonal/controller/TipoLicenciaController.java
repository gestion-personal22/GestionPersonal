package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.GestionPersonal.entity.TipoLicencia;
import com.example.GestionPersonal.service.ITipoLicenciaService;

@RequestMapping("/tipoLicencia")
@Controller
public class TipoLicenciaController {

	@Autowired
	private ITipoLicenciaService servTipoLicencia;
	
	@PostMapping("/crear")
	public String crearTipoLicencia (TipoLicencia tipoLicencia) {
		
		servTipoLicencia.crearTipoLicencia(tipoLicencia);
		
		return null;
	}
	
	
	@PostMapping("/eliminar")
	public String eliminarTipoLicencia (@RequestParam("idTipoLicencia")Long id) {
		
		servTipoLicencia.eliminarTipoLicencia(id);
		
		return null;
	}
	
	
	@PostMapping("/editar")
	public String editarTipoLicencia (@RequestParam("idTipoLicencia")Long id, TipoLicencia tipoLicencia) {
		
		servTipoLicencia.editarTipoLicencia(id, tipoLicencia);
		
		return null;
	}
	
	
	@GetMapping("/buscar")
	public String buscarTipoLicencia (@RequestParam("idTipoLicencia")Long id) {
		
		servTipoLicencia.buscarTipoLicencia(id);
		
		return null;
	}
	
	
	@GetMapping("/lista")
	public String listarTipoLicencia(Model model) {
		
		model.addAttribute("listTipoLice", servTipoLicencia.listarTipoLicencias());
		
		return null;
	}
	
	
	
	
	}


