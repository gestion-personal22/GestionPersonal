package com.example.GestionPersonal.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestionPersonal.entity.TipoLicencia;
import com.example.GestionPersonal.repository.ITipoLicenciaRepository;
import com.example.GestionPersonal.service.ITipoLicenciaService;

@Service
public class TipoLicenciaService implements ITipoLicenciaService {

	@Autowired
	private ITipoLicenciaRepository repoTipoLicen;
	
	@Override
	public void crearTipoLicencia(TipoLicencia tipoLicencia) {
		
		repoTipoLicen.save(tipoLicencia);
	}

	@Override
	public void eliminarTipoLicencia(Long id) {
		
		repoTipoLicen.deleteById(id);
	}

	@Override
	public void editarTipoLicencia(Long id, TipoLicencia tipoLicencia) {
		
		TipoLicencia tipoLicenciaE = this.buscarTipoLicencia(id);
		
		tipoLicenciaE.setTipo(tipoLicencia.getTipo());
		
		this.crearTipoLicencia(tipoLicenciaE);
	}

	@Override
	public TipoLicencia buscarTipoLicencia(Long id) {
		
		return repoTipoLicen.findById(id).orElse(null);
	}

	@Override
	public List<TipoLicencia> listarTipoLicencias() {
		
		return repoTipoLicen.findAll();
	}

	
	
	
	
	
	
}
