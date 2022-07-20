package com.idat.ec3JuanNarreaReservaCitas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3JuanNarreaReservaCitas.Repository.UsuarioClienteRepository;
import com.idat.ec3JuanNarreaReservaCitas.modelo.UsuarioCliente;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {
	
	@Autowired
	UsuarioClienteRepository repository;

	@Override
	public void guardarUsuarioCliente(UsuarioCliente usuarioCliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarUsuarioCliente(UsuarioCliente usuarioCliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarUsuarioCliente(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UsuarioCliente> listarUsuarioCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioCliente obtenerUsuarioClienteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
