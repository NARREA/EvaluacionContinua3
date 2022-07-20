package com.idat.ec3JuanNarreaReservaCitas.Service;

import java.util.List;

import com.idat.ec3JuanNarreaReservaCitas.modelo.Hospital;



public interface HospitalService {
	
void guardarHospital(Hospital hospital);
	
	void actualizarHospital(Hospital hospital);
	
	void eliminarHospitale(Integer id);
	
	List<Hospital> listarHospital();
	
	Hospital obtenerHospitalId(Integer id);

}
