package es.tfg.drivex.service;

import java.util.List;

import es.tfg.drivex.entitybeans.Coche;

public interface CocheService {
	List<Coche> buscarTodos();
	Coche buscarUno(int idCoche);
	List<Coche>buscarCochesPorMarca(int idMarca);
	List<Coche>CochesPrecioMenorMayor(int idMarca);
	List<Coche>CochesPrecioMayorMenor(int idMarca);
	List<Coche>todosCochesPrecioMenorMayor();
	List<Coche>todosCochesPrecioMayorMenor();
}
