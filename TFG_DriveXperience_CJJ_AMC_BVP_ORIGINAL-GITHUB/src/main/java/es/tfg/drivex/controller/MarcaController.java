package es.tfg.drivex.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.tfg.drivex.entitybeans.Marca;
import es.tfg.drivex.service.MarcaService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/marca")
public class MarcaController {
	
	@Autowired
	private MarcaService mserv;

	@GetMapping("/todas")
	public List<Marca> buscarTodas() {
		return mserv.buscarTodos();
	}
}
