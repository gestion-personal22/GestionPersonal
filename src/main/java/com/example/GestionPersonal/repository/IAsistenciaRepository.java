package com.example.GestionPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.GestionPersonal.entity.Asistencia;

@Repository
public interface IAsistenciaRepository extends JpaRepository<Asistencia, Long>{

}
