package com.example.GestionPersonal.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestionPersonal.entity.TipoFamiliar;
import com.example.GestionPersonal.repository.ITipoFamiliarRepository;
import com.example.GestionPersonal.service.ITipoFamiliarService;

@Service
public class TipoFamiliarService implements ITipoFamiliarService {
	
	@Autowired
	private ITipoFamiliarRepository repoTipoFamilar;
	
	@Override
	public void crearTipoFamiliar(TipoFamiliar tipoFamiliar) {
		
		repoTipoFamilar.save(tipoFamiliar);
	}

	@Override
	public void eliminarTipoFamiliar(Long id) {
		
		repoTipoFamilar.deleteById(id);
		
	}

	@Override
	public void editarTipoFamiliar(Long id, TipoFamiliar tipoFamiliar) {
		
		TipoFamiliar tipoFamiliarE = this.buscarTipoFamiliar(id);
		
		tipoFamiliarE.setTipo(tipoFamiliar.getTipo());
		
		this.crearTipoFamiliar(tipoFamiliarE);
	}

	@Override
	public TipoFamiliar buscarTipoFamiliar(Long id) {
		
		return repoTipoFamilar.findById(id).orElse(null);
	}

	@Override
	public List<TipoFamiliar> listarTipoFamiliares() {
		
		return repoTipoFamilar.findAll();
	}

	
	
	
}
