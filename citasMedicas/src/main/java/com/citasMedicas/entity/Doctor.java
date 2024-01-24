package com.citasMedicas.entity;

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
	@Column(name = "apellido_materno")
	private String apellido_materno;
	@Column(name = "apellido_paterno")
	private String apellido_paterno;
	@Column(name = "especialidad")
	private String especialidad;
	

	public Doctor() {
		super();
	}

	public Doctor(int id_doctor, String nombre, String apellido_materno, String apellido_paterno, String especialidad) {
		super();
		this.id_doctor = id_doctor;
		this.nombre = nombre;
		this.apellido_materno = apellido_materno;
		this.apellido_paterno = apellido_paterno;
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
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
}
