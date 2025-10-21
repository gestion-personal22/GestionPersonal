package com.example.GestionPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestionPersonal.entity.TipoFamiliar;

@Repository
public interface ITipoFamiliarRepository extends JpaRepository<TipoFamiliar, Long> {

}
