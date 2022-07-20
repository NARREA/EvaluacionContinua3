package com.idat.ec3JuanNarreaReservaCitas.Service;

import java.util.List;

import com.idat.ec3JuanNarreaReservaCitas.modelo.UsuarioCliente;

public interface UsuarioClienteService {
	
void guardarUsuarioCliente(UsuarioCliente usuarioCliente);
	
	void actualizarUsuarioCliente(UsuarioCliente usuarioCliente);
	
	void eliminarUsuarioCliente(Integer id);
	
	List<UsuarioCliente> listarUsuarioCliente();
	
	UsuarioCliente obtenerUsuarioClienteId(Integer id);
	

}
