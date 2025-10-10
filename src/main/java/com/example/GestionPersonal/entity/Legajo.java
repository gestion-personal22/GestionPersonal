package com.example.GestionPersonal.entity;

import java.time.LocalDate;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Legajo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaRegistro;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	@Basic
	private String nombre;
	private String apellido;
	private String dni;
	private String cuil;
	private String correo;
	private String telefono;
	private String titulo;
	
	@OneToOne
	@JoinColumn(name = "id_direccion")
	private Direccion direccion;
	
	@OneToOne
	@JoinColumn(name = "id_estadoCivil")
	private EstadoCivil estadoCivil;
	
	@OneToOne
	@JoinColumn(name = "id_cargo")
	private Cargo cargo;
	
	@OneToMany(mappedBy = "legajo")
	private List<DetalleFamiliar> familiares;

	@OneToOne(mappedBy = "legajo")
	private Licencia licencia;
	
	@OneToOne(mappedBy = "legajo")
	private Asistencia asistencia;
	
	@OneToOne(mappedBy = "legajo")
	private Novedad novedad;
	
	public Legajo() {
		super();
	}

	public Legajo(Long id, LocalDate fechaRegistro, LocalDate fechaNacimiento, String nombre, String apellido,
			String dni, String cuil, String correo, String telefono, String titulo, Direccion direccion,
			EstadoCivil estadoCivil, Cargo cargo, List<DetalleFamiliar> familiares, Licencia licencia,
			Asistencia asistencia, Novedad novedad) {
		super();
		this.id = id;
		this.fechaRegistro = fechaRegistro;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuil = cuil;
		this.correo = correo;
		this.telefono = telefono;
		this.titulo = titulo;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.cargo = cargo;
		this.familiares = familiares;
		this.licencia = licencia;
		this.asistencia = asistencia;
		this.novedad = novedad;
	}

	public List<DetalleFamiliar> getFamiliares() {
		return familiares;
	}

	public void setFamiliares(List<DetalleFamiliar> familiares) {
		this.familiares = familiares;
	}

	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}

	public Asistencia getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}

	public Novedad getNovedad() {
		return novedad;
	}

	public void setNovedad(Novedad novedad) {
		this.novedad = novedad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}
