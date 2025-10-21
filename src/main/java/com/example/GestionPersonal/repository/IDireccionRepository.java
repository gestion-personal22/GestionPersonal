package com.example.GestionPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.GestionPersonal.entity.Direccion;

@Repository
public interface IDireccionRepository extends JpaRepository<Direccion, Long>{

}
