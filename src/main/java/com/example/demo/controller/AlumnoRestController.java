	package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Alumno;
import com.example.demo.service.AlumnoService;


@RestController
public class AlumnoRestController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping("/listar")
	public List<Alumno> readAll(){
		return alumnoService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Alumno findById(@PathVariable(name = "id") Long id){
		return alumnoService.findById(id);
	}
}
