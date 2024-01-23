package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Consultorio;
import com.entity.Doctor;
import com.service.SvcCita;
import com.service.SvcConsultorio;
import com.service.SvcDoctor;

@Controller
public class CtrlCitas
{
	@Autowired
	SvcCita svcCita;

	@Autowired
	SvcConsultorio svcConsultorio;

	@Autowired
	SvcDoctor svcDoctor;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}

	@RequestMapping("/registros")
	public ModelAndView registros()
	{
		ModelAndView mv = new ModelAndView("registros");
		List<Doctor> doctores = svcDoctor.listAll();
		List<Consultorio> consultorios = svcConsultorio.listAll();

		Consultorio c = new Consultorio(10,10,10);
		consultorios.add(c);
		mv.addObject("doctores",doctores);
		mv.addObject("consultorios",consultorios);
		return mv;
	}

}
