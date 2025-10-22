package com.example.GestionPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.GestionPersonal.entity.Licencia;

@Repository 
public interface ILicenciaRepository extends JpaRepository<Licencia, Long> {
	
}
