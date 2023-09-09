package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Deporte;
import com.empresa.repository.DeporteRepository;

@Service
public class DeporteServiceImpl implements DeportesService{

	@Autowired
	private DeporteRepository repository;
	@Override
	public List<Deporte> ListDeporte() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	

}
