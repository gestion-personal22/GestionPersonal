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
public class DetalleFamiliar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private String nombre;
	private String apellido;
	private String dni;
	private String cuil;
	private String telefono;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	@OneToOne
	@JoinColumn(name = "id_Direccion")
	private Direccion direccion;
	
	@OneToOne
	@JoinColumn(name = "id_Tipo")
	private TipoFamiliar tipo;
	
	@ManyToOne
	@JoinColumn(name = "id_Legajo")
	private Legajo legajo;
	
	public DetalleFamiliar() {
		super();
	}

	public DetalleFamiliar(Long id, String nombre, String apellido, String dni, String cuil, String telefono,
			LocalDate fechaNacimiento, Direccion direccion, TipoFamiliar tipo, Legajo legajo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuil = cuil;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.tipo = tipo;
		this.legajo = legajo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public TipoFamiliar getTipo() {
		return tipo;
	}

	public void setTipo(TipoFamiliar tipo) {
		this.tipo = tipo;
	}

	public Legajo getLegajo() {
		return legajo;
	}

	public void setLegajo(Legajo legajo) {
		this.legajo = legajo;
	}
	
}
