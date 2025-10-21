package com.example.GestionPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<<< HEAD:src/main/java/com/example/GestionPersonal/repository/ICargoRepository.java
import com.example.GestionPersonal.entity.Cargo;

@Repository
public interface ICargoRepository extends JpaRepository<Cargo, Long> {
========
import com.example.GestionPersonal.entity.TipoLicencia;

@Repository
public interface ITipoLicenciaRepository extends JpaRepository<TipoLicencia,Long> {
>>>>>>>> origin/Feature/TipoLicencia:src/main/java/com/example/GestionPersonal/repository/ITipoLicenciaRepository.java

}
