package com.example.GestionPersonal.entity;

import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Novedad {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Basic
	private String descripcion;
	
	@OneToOne
	@JoinColumn(name = "id_Legajo")
	private Legajo legajo;
	
	@OneToMany(mappedBy = "novedad")
	private List<Asistencia> asistencias;
	
	@OneToMany(mappedBy = "nove")
	private List<Licencia> licencias;
	
	@ManyToOne()
	@JoinColumn(name = "id_Nomina")
	private Nomina nomina;
	
	public Novedad() {
		super();
	}

	public Novedad(Long id, String descripcion, Legajo legajo, List<Asistencia> asistencias, List<Licencia> licencias,
			Nomina nomina) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.legajo = legajo;
		this.asistencias = asistencias;
		this.licencias = licencias;
		this.nomina = nomina;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Legajo getLegajo() {
		return legajo;
	}

	public void setLegajo(Legajo legajo) {
		this.legajo = legajo;
	}

	public List<Asistencia> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public List<Licencia> getLicencias() {
		return licencias;
	}

	public void setLicencias(List<Licencia> licencias) {
		this.licencias = licencias;
	}

	public Nomina getNomina() {
		return nomina;
	}

	public void setNomina(Nomina nomina) {
		this.nomina = nomina;
	}
	
}
