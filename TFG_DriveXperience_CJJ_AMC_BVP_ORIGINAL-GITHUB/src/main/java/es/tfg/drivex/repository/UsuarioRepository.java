package es.tfg.drivex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.tfg.drivex.entitybeans.Reserva;
import es.tfg.drivex.entitybeans.Tarjeta;
import es.tfg.drivex.entitybeans.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
	/** Busca un usuario que corresponda con las credenciales recibidas.
	 * @param email Email del usuario.
	 * @param password contraseña del usuario.
	 * @return Usuario coincidente.
	 */
	@Query("select u from Usuario u where u.email=?1 and u.password=?2")
	Usuario buscarUsuPassword(String email, String password);
	
	/**Busca las tarjetas de un usuario.
	 * @param email Email correspondiente al usuario.
	 * @return Lista de tarjetas asociadas al usuario dado.
	 */
	@Query("select u.tarjetas from Usuario u where u.email=?1")
	List<Tarjeta> tarjetasUsuario(String email);
	
	@Query("select r from Reserva r where r.usuario.email=?1")
	List<Reserva> reservasUsuario(String email);
}
