package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctores")
public class Doctor
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_doctor")
	private int id_doctor;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apelido_materno")
	private String apelido_materno;
	@Column(name = "apelido_paterno")
	private String apelido_paterno;
	@Column(name = "especialidad")
	private String especialidad;

	public Doctor() {super();}

	public Doctor(int id_doctor, String nombre, String apelido_materno, String apelido_paterno, String especialidad) {
		super();
		this.id_doctor = id_doctor;
		this.nombre = nombre;
		this.apelido_materno = apelido_materno;
		this.apelido_paterno = apelido_paterno;
		this.especialidad = especialidad;
	}

	public int getId_doctor() {
		return id_doctor;
	}

	public void setId_doctor(int id_doctor) {
		this.id_doctor = id_doctor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelido_materno() {
		return apelido_materno;
	}

	public void setApelido_materno(String apelido_materno) {
		this.apelido_materno = apelido_materno;
	}

	public String getApelido_paterno() {
		return apelido_paterno;
	}

	public void setApelido_paterno(String apelido_paterno) {
		this.apelido_paterno = apelido_paterno;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
}
