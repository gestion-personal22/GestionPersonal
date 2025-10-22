package com.example.GestionPersonal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class TipoFamiliar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;

	@OneToOne(mappedBy = "tipo")
	private DetalleFamiliar familiar;
	
	public TipoFamiliar() {
		super();
	}

	public TipoFamiliar(Long id, String tipo, DetalleFamiliar familiar) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.familiar = familiar;
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

	public DetalleFamiliar getFamiliar() {
		return familiar;
	}

	public void setFamiliar(DetalleFamiliar familiar) {
		this.familiar = familiar;
	}
	
}
