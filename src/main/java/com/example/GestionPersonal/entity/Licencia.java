package com.example.GestionPersonal.entity;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Licencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Basic
	private int numeroSolicitud;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaSolicitud;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate antiguedad;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate tiempoLicencia;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaInicio;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaFin;
    
    @OneToOne
    @JoinColumn(name = "id_Legajo")
    private Legajo legajo;
    
    @OneToOne
    @JoinColumn(name = "id_tipoLicencia")
    private TipoLicencia tipoLicencia;
    
    @ManyToOne()
	@JoinColumn(name = "id_novedad")
	private Novedad novedad;
    
	public Licencia() {
		super();
	}

	public Licencia(Long id, int numeroSolicitud, LocalDate fechaSolicitud, LocalDate antiguedad,
			LocalDate tiempoLicencia, LocalDate fechaInicio, LocalDate fechaFin, Legajo legajo,
			TipoLicencia tipoLicencia, Novedad novedad) {
		super();
		this.id = id;
		this.numeroSolicitud = numeroSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.antiguedad = antiguedad;
		this.tiempoLicencia = tiempoLicencia;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.legajo = legajo;
		this.tipoLicencia = tipoLicencia;
		this.novedad = novedad;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroSolicitud() {
		return numeroSolicitud;
	}

	public void setNumeroSolicitud(int numeroSolicitud) {
		this.numeroSolicitud = numeroSolicitud;
	}

	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(LocalDate fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public LocalDate getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(LocalDate antiguedad) {
		this.antiguedad = antiguedad;
	}

	public LocalDate getTiempoLicencia() {
		return tiempoLicencia;
	}

	public void setTiempoLicencia(LocalDate tiempoLicencia) {
		this.tiempoLicencia = tiempoLicencia;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Legajo getLegajo() {
		return legajo;
	}

	public void setLegajo(Legajo legajo) {
		this.legajo = legajo;
	}

	public TipoLicencia getTipoLicencia() {
		return tipoLicencia;
	}

	public void setTipoLicencia(TipoLicencia tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public Novedad getNovedad() {
		return novedad;
	}

	public void setNovedad(Novedad novedad) {
		this.novedad = novedad;
	}
    
}
