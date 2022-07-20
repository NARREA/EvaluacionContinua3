package com.idat.ec3JuanNarreaReservaCitas.Service;

import java.util.List;

import com.idat.ec3JuanNarreaReservaCitas.modelo.Cliente;

public interface ClienteService {
	
	void guardarCliente(Cliente cliente);
	
	void actualizarCliente(Cliente cliente);
	
	void eliminarCliente(Integer id);
	
	List<Cliente> listarCliente();
	
	Cliente obtenerClienteId(Integer id);

}
