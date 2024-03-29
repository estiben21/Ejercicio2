package com.empresa.service;

import java.util.List;

import com.empresa.entity.Proveedor;

public interface ProveedorService {

	public abstract Proveedor insertaProveedor(Proveedor obj);
	public abstract List<Proveedor> ListaPorNombre(String nombre);
	public abstract List<Proveedor> ListaPorDni(String dni);
}
