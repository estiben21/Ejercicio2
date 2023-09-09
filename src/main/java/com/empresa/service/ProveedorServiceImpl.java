package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Proveedor;
import com.empresa.repository.ModalidadRepository;
import com.empresa.repository.ProveedorRepoisitory;

@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	@Autowired
	private ProveedorRepoisitory repository;

	@Override
	public Proveedor insertaModalidad(Proveedor obj) {
		return repository.save(obj);
	}

	@Override
	public List<Proveedor> ListaPorNombre(String nombre) {
		return repository.findByNombreIgnoreCase(nombre);
	}

}
