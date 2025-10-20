package com.example.GestionPersonal.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GestionPersonal.entity.Licencia;
import com.example.GestionPersonal.repository.ILicenciaRepository;
import com.example.GestionPersonal.service.ILicenciaService;

@Service
public class LicenciaService implements ILicenciaService{

	@Autowired
	private ILicenciaRepository repoLicencia; 
	
	@Override
	public void crearLicencia(Licencia licencia) {
		// TODO Auto-generated method stub
		repoLicencia.save(licencia);
		
	}

	@Override
	public void eliminarLicencia(Long id) {
		// TODO Auto-generated method stub
		repoLicencia.deleteById(id);		
	}

	@Override
	public void editarLicencia(Long id, Licencia licencia) {
	
		Licencia licenciaB = this.buscarLicencia(id);
		
		licenciaB.setTipoLicencia(licencia.getTipoLicencia());
		licenciaB.setNumeroSolicitud(licencia.getNumeroSolicitud());
		licenciaB.setFechaSolicitud(licencia.getFechaSolicitud());
		licenciaB.setAntiguedad(licencia.getAntiguedad());
		licenciaB.setTiempoLicencia(licencia.getTiempoLicencia());
		licenciaB.setFechaInicio(licencia.getFechaInicio());
		licenciaB.setFechaFin(licencia.getFechaFin());
		
		this.crearLicencia(licenciaB);
		
	}

	@Override
	public Licencia buscarLicencia(Long id) {
		// TODO Auto-generated method stub
		return repoLicencia.findById(id).orElse(null);
	}

	@Override
	public List<Licencia> listarLicencias() {
		// TODO Auto-generated method stub
		return repoLicencia.findAll();
	}

}
