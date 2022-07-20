package com.idat.ec3JuanNarreaReservaCitas.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Table(name = "clientes")
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private Integer celular;
	
	@ManyToMany(mappedBy = "clientes",cascade = 
		{CascadeType.PERSIST,CascadeType.MERGE})
	private List<Hospital>hospital = new ArrayList<>();
	
	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCelular() {
		return celular;
	}
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	
}
