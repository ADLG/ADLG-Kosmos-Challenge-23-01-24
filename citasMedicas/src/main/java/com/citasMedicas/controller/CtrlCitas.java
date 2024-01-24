package com.citasMedicas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.citasMedicas.entity.Cita;
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
	
	@RequestMapping("/reg")
	public ModelAndView reg()
	{
		ModelAndView mv = new ModelAndView("registros");
		List<Cita> citas = svcCita.listAll();
		mv.addObject("citas",citas);
		return mv;
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

	@PostMapping("/agregarCita")
	public String agregarCita(String consultorio,String doctor,String horario_consulta,String nombre_paciente,String fecha_consulta, Model model)
	{
		svcCita.insertCita(svcCita.ultimaCita()+1,consultorio,doctor,fecha_consulta,horario_consulta,nombre_paciente);
		return "redirect:/";
	}


	@RequestMapping("/eliminarCita/{id}")
	public String eliminarCita(@PathVariable(name = "id") int id)
	{
		svcCita.delete(id);
		return "redirect:/reg";
	}
}
