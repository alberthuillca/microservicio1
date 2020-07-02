package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AlumnoDao;
import com.example.demo.entity.Alumno;
import com.example.demo.service.AlumnoService;


@Service
public class AlumnoServiceImp implements AlumnoService{
@Autowired
private AlumnoDao alumnodao;
	@Override
	@Transactional
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return (List<Alumno>) alumnodao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Alumno findById(Long id) {
		return alumnodao.findById(id).orElse(null);
	}
	
}
