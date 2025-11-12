package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.GestionPersonal.entity.Asistencia;
import com.example.GestionPersonal.service.IAsistenciaService;

@Controller
@RequestMapping("/asistencia")
public class AsistenciaController {

	@Autowired
	private IAsistenciaService servAsistencia;
	
	@PostMapping("/crear")
	public String crearAsistencia(Asistencia asistencia) {
		
		servAsistencia.crearAsistencia(asistencia);
		
		return null;
	}
	
	@PostMapping("/eliminar")
    public String eliminarAsistencia(@RequestParam("idAsistencia") Long id) {
		
		
		servAsistencia.eliminarAsistencia(id);
		
		return null;
	}
	
	@PostMapping("/editar")
    public String editarAsistencia(@RequestParam("idAsistencia") Long id, 
    		                       Asistencia asistencia) {
		
		servAsistencia.editarAsistencia(id, asistencia);
		
		
		return null;
	}
	
	@GetMapping("/buscar")
    public String buscarAsistencia(@RequestParam("idAsistencia") Long id) {
		
		servAsistencia.buscarAsistencia(id);
		
		return null;
	}
	
	@GetMapping("/listar")
    public String listarAsistencias(Model model) {
		
		model.addAttribute("Asistencias", servAsistencia.listarAsistencias());
		
		return null;
	}
	
	@GetMapping("/pag/cargar")
	public String paginaCargar() {
		
		return "Asistencia/carga";
	}
}
