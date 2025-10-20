package com.example.GestionPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
<<<<<<<< HEAD:src/main/java/com/example/GestionPersonal/repository/ILegajoRepository.java

import com.example.GestionPersonal.entity.Legajo;

@Repository 
public interface ILegajoRepository extends JpaRepository<Legajo, Long> {
========
import com.example.GestionPersonal.entity.DetalleFamiliar;

@Repository
public interface IDetalleFamiliarRepository extends JpaRepository<DetalleFamiliar, Long>{
>>>>>>>> 16c8567 (Proceso de CRUD_DetalleFamiliar Finalizado):src/main/java/com/example/GestionPersonal/repository/IDetalleFamiliarRepository.java

}
