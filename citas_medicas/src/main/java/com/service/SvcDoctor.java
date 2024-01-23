package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Doctor;
import com.repository.RepoDoctor;

@Service
public class SvcDoctor
{
	@Autowired
	RepoDoctor repoDoctor;

	public List<Doctor> listAll()
	{
		return repoDoctor.findAll();
	}

	public void save(Doctor Doctor)
	{
		repoDoctor.save(Doctor);
	}

	public Doctor get(int id)
	{
		return repoDoctor.findById(id).get();
	}

	public void delete(int id)
	{
		repoDoctor.deleteById(id);
	}
}
