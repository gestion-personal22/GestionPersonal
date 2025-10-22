package com.example.GestionPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.GestionPersonal.entity.Novedad;
import org.springframework.stereotype.Repository;

@Repository
public interface INovedadRepository extends JpaRepository<Novedad, Long>{

}
