package com.example.GestionPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.GestionPersonal.service.imple.LicenciaService;

@Controller
public class LicenciaController {

	@Autowired
	private LicenciaService userService;
	
}
