package com.citasMedicas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citasMedicas.entity.Consultorio;
import com.citasMedicas.repository.RepoConsultorio;

@Service
public class SvcConsultorio
{
	@Autowired
	RepoConsultorio repoConsultorio;

	public List<Consultorio> listAll()
	{
		return repoConsultorio.findAll();
	}

	public void save(Consultorio Consultorio)
	{
		repoConsultorio.save(Consultorio);
	}

	public Consultorio get(int id)
	{
		return repoConsultorio.findById(id).get();
	}

	public void delete(int id)
	{
		repoConsultorio.deleteById(id);
	}
}
