package es.tfg.drivex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.tfg.drivex.entitybeans.Coche;

public interface CocheRepository extends JpaRepository<Coche, Integer>{

}
