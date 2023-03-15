package es.tfg.drivex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.tfg.drivex.entitybeans.Marca;
import es.tfg.drivex.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaRepository mrep;
	
	@Override
	public List<Marca> buscarTodos() {
		// TODO Auto-generated method stub
		return mrep.findAll();
	}

}
