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

	@Override
	public Coche buscarUno(int idCoche) {
		return crep.findById(idCoche).orElse(null);
	}

	@Override
	public List<Coche> buscarCochesPorMarca(int idMarca) {
		return crep.buscarCochePorMarca(idMarca);
	}

	@Override
	public List<Coche> CochesPrecioMenorMayor(int idMarca) {
		return crep.CochesPrecioMenorMayor(idMarca);
	}

	@Override
	public List<Coche> CochesPrecioMayorMenor(int idMarca) {
		return crep.CochesPrecioMayorMenor(idMarca);
	}

	@Override
	public List<Coche> todosCochesPrecioMenorMayor() {
		// TODO Auto-generated method stub
		return crep.TodosCochesPrecioMenorMayor();
	}

	@Override
	public List<Coche> todosCochesPrecioMayorMenor() {
		// TODO Auto-generated method stub
		return crep.TodosCochesPrecioMayorMenor();
	}

}
