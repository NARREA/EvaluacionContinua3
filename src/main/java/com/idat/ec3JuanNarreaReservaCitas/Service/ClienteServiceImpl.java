package com.idat.ec3JuanNarreaReservaCitas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3JuanNarreaReservaCitas.Repository.ClienteRepository;
import com.idat.ec3JuanNarreaReservaCitas.modelo.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository repository;
	
	@Override
	public void guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
