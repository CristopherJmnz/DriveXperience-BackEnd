package es.tfg.drivex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.tfg.drivex.entitybeans.Reserva;
import es.tfg.drivex.entitybeans.Tarjeta;
import es.tfg.drivex.entitybeans.Usuario;
import es.tfg.drivex.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioRepository urep;
	
	@Override
	public Usuario buscarUsuPassword(String email, String password) {
		Usuario usu=urep.buscarUsuPassword(email, password);
		if (usu!=null) {
			return usu;
		}
		return null;
	}

	@Override
	public int altaUsuario(Usuario usuario) {
		if (urep.findById(usuario.getEmail()).orElse(null) == null) {
			urep.save(usuario);
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public Usuario findByEmail(String email) {
		return urep.findById(email).orElse(null);
	}

	@Override
	public List<Tarjeta> tarjetasUsuario(String email) {
		return urep.tarjetasUsuario(email);
	}

	@Override
	public List<Reserva> reservasUsuario(String email) {
		return urep.reservasUsuario(email);
	}
}
