package com.example.GestionPersonal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestionPersonal.entity.EstadoCivil;

@Repository
public interface IEstadoCivilRepository extends JpaRepository<EstadoCivil, Long> {

	List<EstadoCivil> findAll();

}
