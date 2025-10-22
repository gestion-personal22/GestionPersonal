package com.example.GestionPersonal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class TipoLicencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;
	
	@OneToOne(mappedBy = "tipoLicencia")
	private Licencia licencia;
	
	public TipoLicencia() {
		super();
	}

	public TipoLicencia(Long id, String tipo, Licencia licencia) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.licencia = licencia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	
}
