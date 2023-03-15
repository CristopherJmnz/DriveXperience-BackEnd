package es.tfg.drivex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.tfg.drivex.entitybeans.Coche;
import es.tfg.drivex.repository.CocheRepository;

@Service
public class CocheServiceImpl implements CocheService{

	@Autowired
	private CocheRepository crep;
	
	@Override
	public List<Coche> buscarTodos() {
		return crep.findAll();
	}

}
