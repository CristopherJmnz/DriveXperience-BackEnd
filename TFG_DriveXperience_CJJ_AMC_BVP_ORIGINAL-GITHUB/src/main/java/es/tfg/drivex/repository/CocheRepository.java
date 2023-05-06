package es.tfg.drivex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.tfg.drivex.entitybeans.Coche;

public interface CocheRepository extends JpaRepository<Coche, Integer>{

	@Query("select c from Coche c where c.marca.idMarca=?1")
	List<Coche>buscarCochePorMarca(int idMarca);
}
