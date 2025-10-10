package com.example.GestionPersonal.entity;

import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Nomina {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Basic
	private double deduccion;
	private double renumeracion;
	
	@OneToMany(mappedBy = "nomina")
	private List<Novedad> novedades;
	
	public Nomina() {
		super();
	}

	public Nomina(Long id, double deduccion, double renumeracion, List<Novedad> novedades) {
		super();
		this.id = id;
		this.deduccion = deduccion;
		this.renumeracion = renumeracion;
		this.novedades = novedades;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getDeduccion() {
		return deduccion;
	}

	public void setDeduccion(double deduccion) {
		this.deduccion = deduccion;
	}

	public double getRenumeracion() {
		return renumeracion;
	}

	public void setRenumeracion(double renumeracion) {
		this.renumeracion = renumeracion;
	}

	public List<Novedad> getNovedades() {
		return novedades;
	}

	public void setNovedades(List<Novedad> novedades) {
		this.novedades = novedades;
	}
	
}
