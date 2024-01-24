package com.citasMedicas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultorios")
public class Consultorio
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_consultorio")
	private int id_consultorio;
	@Column(name = "numero_consultorio")
	private int numero_consultorio;
	@Column(name = "piso")
	private int piso;

	
	public Consultorio() {
		super();
	}
	public Consultorio(int id_consultorio, int numero_consultorio, int piso) {
		super();
		this.id_consultorio = id_consultorio;
		this.numero_consultorio = numero_consultorio;
		this.piso = piso;
	}
	public int getId_consultorio() {
		return id_consultorio;
	}
	public void setId_consultorio(int id_consultorio) {
		this.id_consultorio = id_consultorio;
	}
	public int getNumero_consultorio() {
		return numero_consultorio;
	}
	public void setNumero_consultorio(int numero_consultorio) {
		this.numero_consultorio = numero_consultorio;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}

	
}