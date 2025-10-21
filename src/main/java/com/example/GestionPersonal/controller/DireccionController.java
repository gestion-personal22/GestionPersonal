package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.GestionPersonal.entity.Direccion;
import com.example.GestionPersonal.service.imple.IDireccionService;

@Controller
@RequestMapping("/direccion")
public class DireccionController {

	@Autowired
	private IDireccionService servDireccion;
	
	@PostMapping("/crear")
	public String crearDireccion(Direccion direccion) {
		
		servDireccion.crearDireccion(direccion);
		
		return null;
	}
	
	@PostMapping("/eliminar")
    public String eliminarDireccion(@RequestParam("idDireccion") Long id) {
		
		servDireccion.eliminarDireccion(id);
		
		return null;
	}
	
	@PostMapping("/editar")
    public String editarDireccion(@RequestParam("idDireccion") Long id, Direccion direccion) {
		
		servDireccion.editarDireccion(id, direccion);
		
		
		return null;
	}
	
	@GetMapping("/buscar")
    public String buscarDireccion(@RequestParam("idDireccion") Long id) {
		
		servDireccion.buscarDireccion(id);
		
		return null;
	}
	
	@GetMapping("/listar")
    public String listarDirecciones(Model model) {
		
		model.addAttribute("Direcciones", servDireccion.listarDirecciones());
		
		return null;
	}

}
