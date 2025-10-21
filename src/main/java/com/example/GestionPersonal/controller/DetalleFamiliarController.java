package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.GestionPersonal.entity.DetalleFamiliar;
import com.example.GestionPersonal.service.imple.IDetalleFamiliarService;

@Controller
@RequestMapping("/detalleFamiliar")
public class DetalleFamiliarController {

	@Autowired
	private IDetalleFamiliarService servDetalle;
	
	@PostMapping("/crear")
	public String crearDetalleFamiliar(DetalleFamiliar detalleFamiliar) {
		
		servDetalle.crearDetalleFamiliar(detalleFamiliar);
		
		return null;
	}
	
	@PostMapping("/eliminar")
    public String eliminarDetalleFamiliar(@RequestParam("idDetalle") Long id) {
		
		
		servDetalle.eliminarDetalleFamiliar(id);
		
		return null;
	}
	
	@PostMapping("/editar")
    public String editarDetalleFamiliar(@RequestParam("idDetalle") Long id, 
    		                          DetalleFamiliar detalleFamiliar) {
		
		servDetalle.editarDetalleFamiliar(id, detalleFamiliar);
		
		
		return null;
	}
	
	@GetMapping("/buscar")
    public String buscarDetalleFamiliar(@RequestParam("idDetalle") Long id) {
		
		servDetalle.buscarDetalleFamiliar(id);
		
		return null;
	}
	
	@GetMapping("/listar")
    public String listarDetalleFamiliares(Model model) {
		
		model.addAttribute("Detalles", servDetalle.listarDetalleFamiliares());
		
		return null;
	}
	
}
