package es.tfg.drivex.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.tfg.drivex.dto.ReservaDto;
import es.tfg.drivex.entitybeans.Reserva;
import es.tfg.drivex.entitybeans.Tarjeta;
import es.tfg.drivex.entitybeans.Usuario;
import es.tfg.drivex.repository.UsuarioRepository;
import es.tfg.drivex.service.CocheService;
import es.tfg.drivex.service.ReservaService;
import es.tfg.drivex.service.UsuarioService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService userv;
	@Autowired
	private UsuarioRepository urep;
	
	@Autowired
	private ReservaService rserv;
	
	@Autowired
	private CocheService cserv;
	
	@GetMapping("/reservas/{email}")
	public List<Reserva> reservasUsuario(@PathVariable String email) {
		return userv.reservasUsuario(email);
	}
	
	/**Método para inicar sesión
	 * Si las credenciales no coinciden con un usuario ya registrado se devolvera null
	 * @param usuario Usuario con email y password
	 * @return usuario
	 */
	@PostMapping("/login")
	public Usuario login(@RequestBody Usuario usuario) {
		if (userv.buscarUsuPassword(usuario.getEmail(), usuario.getPassword())!=null) { 
			return userv.buscarUsuPassword(usuario.getEmail(), usuario.getPassword());
		}
		return null;
	}
	
	/**Registra Usuario
	 * @param usuario Usuario con todos sus atributos
	 * @return 1 si ha ido bien o 0 si no se ha realizado
	 */
	@PostMapping("/registro")
	public int registro(@RequestBody Usuario usuario) {
		
		if (userv.altaUsuario(usuario)==1) {
			return 1;
		}
		return 0;

	}
	
	
	/**Envíamos las tarjetas de un usuario.
	 * @param email Email del usuario.
	 * @return lista con todas las tarjetas del usuario.
	 */
	@GetMapping("/tarjetas/{email}")
	public List<Tarjeta> tarjetasDeCliente(@PathVariable("email") String email){
		return userv.tarjetasUsuario(email);
	}
	
	
	/**Añadir una tarjeta a un usuario.
	 * @param email Email del usuario que va a registar la tarjeta.
	 * @param tarjeta Tarjeta con todos sus datos.
	 * @return La tarjeta dada de alta.
	 */
	@PostMapping("/tarjeta/add/{email}")
	public Tarjeta addTarjeta(@PathVariable("email") String email,@RequestBody Tarjeta tarjeta){
		Usuario usu=userv.findByEmail(email);
		usu.addTarjeta(tarjeta);
		urep.save(usu);
		return tarjeta;
	}
	
	/**Elimina una tarjeta
	 * @param email Email del usuario que va a eliminar la tarjeta
	 * @param tarjeta Trajeta con sus datos
	 * @return La tarjeta eliminada
	 */
	@PostMapping("/tarjeta/remove/{email}")
	public Tarjeta removeTarjeta(@PathVariable("email") String email,@RequestBody Tarjeta tarjeta){
		Usuario usu=userv.findByEmail(email);
		usu.removeTarjeta(tarjeta);
		return tarjeta;
	}
	
	
	@PostMapping("/reserva")
	public ReservaDto procesarReserva(@RequestBody ReservaDto reservadto){
		Reserva reserva = new Reserva();
		System.out.println(cserv.buscarUno(reservadto.getIdCoche()));
		reserva.setCoche(cserv.buscarUno(reservadto.getIdCoche()));
		reserva.setUsuario(urep.findById(reservadto.getEmail()).orElse(null));
		reserva.setFechaFin(reservadto.getFechaFin());
		reserva.setFechaInicio(reservadto.getFechaInicio());
		reserva.setIdReserva(0);
		reserva.setPrecioTotal(reservadto.getPrecioTotal());
		rserv.altaReserva(reserva);
		return reservadto;
	}
}
