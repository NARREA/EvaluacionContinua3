package com.idat.ec3JuanNarreaReservaCitas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ec3JuanNarreaReservaCitas.modelo.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
