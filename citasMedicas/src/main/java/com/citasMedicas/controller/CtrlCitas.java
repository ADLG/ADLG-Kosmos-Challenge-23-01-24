package com.citasMedicas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.citasMedicas.entity.Consultorio;
import com.citasMedicas.entity.Doctor;
import com.citasMedicas.service.SvcCita;
import com.citasMedicas.service.SvcConsultorio;
import com.citasMedicas.service.SvcDoctor;

@Controller
public class CtrlCitas
{
	@Autowired
	SvcCita svcCita;

	@Autowired
	SvcConsultorio svcConsultorio;

	@Autowired
	SvcDoctor svcDoctor;
	
	// @RequestMapping("/")
	// public String index()
	// {
	// 	return "index";
	// }

	@RequestMapping("/reg")
	public String reg()
	{
		// List<Consultorio> consultorios = svcConsultorio.listAll();
		// System.out.println(consultorios.size());
		return "registros";
	}

	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		List<Doctor> doctores = svcDoctor.listAll();
		List<Consultorio> consultorios = svcConsultorio.listAll();

		mv.addObject("doctores",doctores);
		mv.addObject("consultorios",consultorios);
		return mv;
	}

}
