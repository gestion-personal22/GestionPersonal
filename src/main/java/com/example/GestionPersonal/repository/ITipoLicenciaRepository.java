package com.example.GestionPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestionPersonal.entity.TipoLicencia;

@Repository
public interface ITipoLicenciaRepository extends JpaRepository<TipoLicencia,Long> {

}
