package es.tfg.drivex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.tfg.drivex.entitybeans.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Integer>{ 

}
