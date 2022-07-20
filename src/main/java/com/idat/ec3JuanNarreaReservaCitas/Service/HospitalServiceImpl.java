package com.idat.ec3JuanNarreaReservaCitas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3JuanNarreaReservaCitas.Repository.HospitalRepository;
import com.idat.ec3JuanNarreaReservaCitas.modelo.Hospital;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	HospitalRepository repository;

	@Override
	public void guardarHospital(Hospital hospital) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarHospital(Hospital hospital) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarHospitale(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Hospital> listarHospital() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hospital obtenerHospitalId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
