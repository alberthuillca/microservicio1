package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Alumno;


public interface AlumnoService {
	public List<Alumno> findAll();
	public Alumno findById(Long id);
}
