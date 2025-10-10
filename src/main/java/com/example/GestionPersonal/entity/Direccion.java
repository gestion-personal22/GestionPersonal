package com.example.GestionPersonal.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Direccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Basic
	private String calle;
	private String localidad;
	private String provincia;
	
	@OneToOne(mappedBy = "direccion")
	private Legajo legajo;
	
	@OneToOne(mappedBy = "direccion")
	private DetalleFamiliar familiar;
	
	public Direccion() {
		super();
	}

	public Direccion(Long id, String calle, String localidad, String provincia, Legajo legajo,
			DetalleFamiliar familiar) {
		super();
		this.id = id;
		this.calle = calle;
		this.localidad = localidad;
		this.provincia = provincia;
		this.legajo = legajo;
		this.familiar = familiar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Legajo getLegajo() {
		return legajo;
	}

	public void setLegajo(Legajo legajo) {
		this.legajo = legajo;
	}

	public DetalleFamiliar getFamiliar() {
		return familiar;
	}

	public void setFamiliar(DetalleFamiliar familiar) {
		this.familiar = familiar;
	}
	
}
