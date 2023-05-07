package es.tfg.drivex.service;

import java.util.List;

import es.tfg.drivex.entitybeans.Reserva;
import es.tfg.drivex.entitybeans.Tarjeta;
import es.tfg.drivex.entitybeans.Usuario;

public interface UsuarioService {

	Usuario buscarUsuPassword(String email,String password);
	int altaUsuario(Usuario usuario);
	Usuario findByEmail(String email);
	List<Tarjeta>tarjetasUsuario(String email);
	List<Reserva> reservasUsuario(String email);
	
}
