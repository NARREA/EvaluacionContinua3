package com.idat.ec3JuanNarreaReservaCitas.Security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.idat.ec3JuanNarreaReservaCitas.Repository.UsuarioClienteRepository;
import com.idat.ec3JuanNarreaReservaCitas.modelo.UsuarioCliente;

@Service
public class UserDetailService implements UserDetailsService{
	
	@Autowired
	private UsuarioClienteRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UsuarioCliente usuario = repository.findByUsuario(username);
		
		
		if(usuario != null) {
			List<SimpleGrantedAuthority> listGranted = new ArrayList<>();
			SimpleGrantedAuthority granted = new SimpleGrantedAuthority(usuario.getRol());
			listGranted.add(granted);
			
			return new User(usuario.getUsuario(), usuario.getPassword(), listGranted);
		}else
			
			throw new  UsernameNotFoundException("Usuario no existe" + username);
	}

	
	


}
