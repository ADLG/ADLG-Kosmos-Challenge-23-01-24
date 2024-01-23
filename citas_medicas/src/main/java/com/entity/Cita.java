package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cita")
	private int id_cita;
	@Column(name = "consultorio")
	private String consultorio;
	@Column(name = "doctor")
	private String doctor;
	@Column(name = "horario_consulta")
	private String horario_consulta;
	@Column(name = "nombre_paciente")
	private String nombre_paciente;
	@Column(name = "fecha_consulta")
	private String fecha_consulta;

	public Cita() {
		super();
	}
	
	public Cita(int id_cita, String consultorio, String doctor, String horario_consulta, String nombre_paciente, String fecha_consulta) {
		super();
		this.id_cita = id_cita;
		this.consultorio = consultorio;
		this.doctor = doctor;
		this.horario_consulta = horario_consulta;
		this.nombre_paciente = nombre_paciente;
		this.fecha_consulta = fecha_consulta;
	}

	public int getId_cita() {
		return id_cita;
	}

	public void setId_cita(int id_cita) {
		this.id_cita = id_cita;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getHorario_consulta() {
		return horario_consulta;
	}

	public void setHorario_consulta(String horario_consulta) {
		this.horario_consulta = horario_consulta;
	}

	public String getNombre_paciente() {
		return nombre_paciente;
	}

	public void setNombre_paciente(String nombre_paciente) {
		this.nombre_paciente = nombre_paciente;
	}
	
	public String getFecha_consulta() {
		return fecha_consulta;
	}

	public void setFecha_consulta(String fecha_consulta) {
		this.fecha_consulta = fecha_consulta;
	}
	
	
	
}
