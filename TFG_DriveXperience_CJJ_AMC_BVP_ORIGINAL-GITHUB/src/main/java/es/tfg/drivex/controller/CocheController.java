package es.tfg.drivex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.tfg.drivex.entitybeans.Coche;
import es.tfg.drivex.service.CocheService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/coche")
public class CocheController {
	@Autowired
	private CocheService cserv;

	@GetMapping("/buscarUno/{id}")
	public Coche buscarUno(@PathVariable("id") int idCoche) {
		return cserv.buscarUno(idCoche);
	}
	
	@GetMapping("/buscarTodos")
	public List<Coche> buscarTodos() {
		return cserv.buscarTodos();
	}
	
	@GetMapping("/marca/{id}")
	public List<Coche> buscarCochesPorMarca(@PathVariable("id") int idMarca) {
		return cserv.buscarCochesPorMarca(idMarca);
	}
}
