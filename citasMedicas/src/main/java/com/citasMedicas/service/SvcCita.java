package com.citasMedicas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citasMedicas.entity.Cita;
import com.citasMedicas.repository.RepoCita;

@Service
public class SvcCita
{
	@Autowired
	RepoCita repoCita;

	public List<Cita> listAll()
	{
		return repoCita.findAll();
	}

	public void save(Cita Cita)
	{
		repoCita.save(Cita);
	}

	public Cita get(int id)
	{
		return repoCita.findById(id).get();
	}

	public void delete(int id)
	{
		repoCita.deleteById(id);
	}

	public int ultimaCita()
	{
		return repoCita.ultimaCita();
	}

	public void insertCita(int id_cita, String consultorio,String doctor,String fecha_consulta,String horario,String nombre_paciente)
	{
		repoCita.insertCita(id_cita,consultorio,doctor,horario,nombre_paciente,fecha_consulta);
	}

}
