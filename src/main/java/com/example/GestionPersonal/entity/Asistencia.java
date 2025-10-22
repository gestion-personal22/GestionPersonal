package com.example.GestionPersonal.entity;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class Asistencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private LocalTime horaEntrada;
	private LocalTime horaSalida;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	
	@OneToOne
	@JoinColumn(name = "id_Legajo")
	private Legajo legajo;

	@ManyToOne()
	@JoinColumn(name = "id_novedad")
	private Novedad novedad;
	
	public Asistencia() {
		super();
	}

	public Asistencia(Long id, LocalTime horaEntrada, LocalTime horaSalida, LocalDate fecha, Legajo legajo,
			Novedad novedad) {
		super();
		this.id = id;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.fecha = fecha;
		this.legajo = legajo;
		this.novedad = novedad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Legajo getLegajo() {
		return legajo;
	}

	public void setLegajo(Legajo legajo) {
		this.legajo = legajo;
	}

	public Novedad getNovedad() {
		return novedad;
	}

	public void setNovedad(Novedad novedad) {
		this.novedad = novedad;
	}
	
}
